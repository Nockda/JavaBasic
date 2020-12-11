package com.study.jsp03;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListenerEx implements ServletContextListener {

    public ContextListenerEx() {

    }
    
    public void contextDestoryed(ServletContextEvent event) {
    	System.out.println("어플 종료");
    }
    
    @Override
    public void contextInitialized(ServletContextEvent event) {
    	System.out.println("어플 시작");
    	
    	//Ex#1
    	ServletContext sc = event.getServletContext();
    	sc.setAttribute("schedule", 1000);
    }
    
    //다른 앱에서 다음과 같이 사용 가능
    /*
     * int nTime = (int) request.getSession().getServletContext().getAttribute("schedule");
     * System.out.println("nTime : " + nTime);
     */
    
    // 서버 중지시 어플 제거가 뜸 (가장 늦게 실행)

}
