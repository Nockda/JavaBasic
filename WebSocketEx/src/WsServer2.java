import java.io.IOException;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.RemoteEndpoint.Basic;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/websocketendpoint2")
public class WsServer2{
	private static final java.util.Set<Session> sessions=
			java.util.Collections.synchronizedSet(new java.util.HashSet<Session>());
	/**
	 * @onOpen allows us to intercent the creation of a new session.
	 * The session class allows us to send data to the user.
	 * In the method onOpen, we'll let the user know that the handshake was
	 * successful
	 */
	
	@OnOpen
	public void onOpen(Session session) {
		System.out.println("Open session id: " + session.getId());
		
		try {
			final Basic basic = session.getBasicRemote();
			basic.sendText("Connection Established");
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		sessions.add(session);
	}
	
	@OnClose
	public void onClose(Session session) {
		System.out.println("Session" + session.getId()+" has ended");
		sessions.remove(session);
	}
	
	/**
	 * when a user sends a message to the sever,
	 * this method will intercept the message and allow us to react to it.
	 * For now the message is read as a Stirng.
	 */

	@OnMessage
	public void onMessage(String message, Session session) {
		System.out.println("Message from " + session.getId()+": " + message);
		try {
			final Basic basic = session.getBasicRemote();
			basic.sendText("to : " + message);
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		
		sendAllSessionToMessage( session, message );
	}
	
	private void sendAllSessionToMessage(Session self, String message) {
		try {
			for (Session session : WsServer2.sessions) {
				if(! self.getId().equals(session.getId()))
					session.getBasicRemote().sendText("all : " + message);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	@OnError
	public void onError(Throwable e, Session session) {
		
	}

}
