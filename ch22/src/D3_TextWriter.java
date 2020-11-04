import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class D3_TextWriter {

	public static void main(String[] args) {
		try(Writer out = new FileWriter("data1.txt")){
			for(int ch = (int)'A' ; ch < (int)('Z' + 1); ch++)
				out.write(ch);
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
