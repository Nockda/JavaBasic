import java.io.BufferedWriter;
import java.io.FileWriter;

public class D4_StringWriter {

	public static void main(String[] args) {
		String ks = "공부를 하자";
		String es = "Let's Study";
		
		try(BufferedWriter bw = 
				new BufferedWriter(new FileWriter("String.txt"))){
			bw.write(ks, 0, ks.length());
			bw.newLine();
			bw.write(es, 0, es.length());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
