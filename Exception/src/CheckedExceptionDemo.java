import java.io.IOException;
import java.sql.SQLException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		If the method we are calling throws an exception, then the caller method has to handle the exception
		try{
			performIOOperation();
		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
		catch(IOException | SQLException e) {	//multi-catch feature
			e.printStackTrace();
		}
	}
	
	static void performIOOperation() throws IOException, SQLException {
//		Code within this method might throw an IOException
//		So, calling this method is risky
//		Because this method is not handling the exception which is getting generated within this method
//		It's the duty of this method to tell callers that calling this method is risky
		throw new IOException();
	}

}
