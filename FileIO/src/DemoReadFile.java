import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public class DemoReadFile {
	public static void main(String[] args) {
//		RAM : Volatile memory
//		To store the data permanently, java has file systems
//		To do that java has given a lot of classes in java.io package
//		Operations : Read or write
//		For Read Operations use "InputStream" => Abstract Class
//		For Write Operations use "OutputStream" => Abstract Class
//		FileInputStream => concrete Class
		
		try {
			//dynamic polymorphism
			InputStream is = new FileInputStream("C:\\Users\\preet\\eclipse-workspace\\FileIO\\src\\DemoReadFile.java");
			int i = is.read();
			while(i != -1) {	//read method returns -1 at the end of the file 
				System.out.print((char)i);
				i = is.read();	// reading the next character in the file
			}
//			System.out.println((char) is.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
}
