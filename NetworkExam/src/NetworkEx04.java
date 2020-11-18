import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkEx04 {

	public static void main(String[] args) {
		URL url;
		BufferedReader input;
		String address = "https://quasarzone.com/bbs/qb_saleinfo?_method=post&_token=k2gJHC1uSnHDo4s4xOeLRobKHVfTv5ben517G9IA&kind=subject&page=2";
		String line = "";
		
		try {
			url = new URL(address);
			
			input= new BufferedReader(new InputStreamReader(url.openStream()))	;
			
			while((line=input.readLine()) != null) {
				System.out.println(line);
			}
			input.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
