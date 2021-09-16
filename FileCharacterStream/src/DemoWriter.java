import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DemoWriter {
	public static void main(String[] args) {
		
//		Reader is an abstract super class for all Reader classes
//		Writer is an abstract super class for all Writer classes
//		This hierarchy is typically used for dealing with unicode characters
		
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("C:\\Users\\preet\\eclipse-workspace\\FileCharacterStream\\about.txt");
			pw.println(" This is HSBC ");
			pw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			pw.close(); //This is must to close the resource
			
		}
	}
}
