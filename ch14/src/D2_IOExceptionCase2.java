import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class D2_IOExceptionCase2 {

	public static void main(String[] args) {
		Path file = Paths.get("D:\\Java\\simple.txt");
		BufferedWriter writer = null;
		
		try {
			// 아래 문장에서 IOException 발생 가능
			writer = Files.newBufferedWriter(file);
			
			writer.write('a');
			writer.write('z');
			
			if(writer != null)
				writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
