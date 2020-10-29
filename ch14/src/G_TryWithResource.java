import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class G_TryWithResource {

	public static void main(String[] args) {
		Path file = Paths.get("D:\\Java\\simple.txt");
		
		try(BufferedWriter writer = Files.newBufferedWriter(file)){
			writer.write('a');
			writer.write('b');
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
