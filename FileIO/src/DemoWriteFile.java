import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class DemoWriteFile {
	public static void main(String[] args) {
//		RAM : Volatile memory
//		To store the data permanently, java has file systems
//		To do that java has given a lot of classes in java.io package
//		Operations : Read or write
//		For Read Operations use "InputStream" => Abstract Class
//		For Write Operations use "OutputStream" => Abstract Class
//		FileInputStream => concrete Class
		
		try {
//			dynamic polymorphism
//			File which we're trying to read must be in existence, otherwise it will throw FileNotFoundException
			InputStream is = new FileInputStream("C:\\Users\\preet\\eclipse-workspace\\FileIO\\src\\DemoReadFile.java");
//			File which we're trying to write exists, all the existing data would be deleted and a new blank file will be created
//			If the file to be written doesn't exist, a new blank file will get created
			OutputStream os = new FileOutputStream("C:\\\\Users\\\\preet\\\\eclipse-workspace\\\\FileIO\\\\src\\\\CopyDemoWriteFile.java");
			int i = is.read();
			while(i != -1) {	//read method returns -1 at the end of the file 
				System.out.print((char)i);
				os.write((char)i);	// write character in file associated with os reference
				i = is.read();	// reading the next character in the file
			}
//			System.out.println((char) is.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
}
