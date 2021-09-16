import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoReader {

	public static void main(String[] args) {
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\preet\\eclipse-workspace\\FileCharacterStream\\about.txt"));
			System.out.println(reader.readLine());
			System.out.println("Hello");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
//			closing the resource is mandatory
			try {
				if(reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
