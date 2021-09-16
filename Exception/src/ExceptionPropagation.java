import java.io.IOException;

public class ExceptionPropagation {

//	Exception Propagation => Exception will travel via the stack trace.	
	
	public static void main(String[] args) throws IOException{
		display();
		System.out.println("Main");
		
//		************************* Runtime Exceptions ***************************************************************
		
//		Runtime Exceptions / Unchecked Exceptions
//		Any Runtime Exception need not to be handled or declared to be thrown
//		handled means try - catch
//		declared to be thrown means throws
//		throw new IndexOutOfBoundsException();
//		throw new ArithmeticException();
//		throw new NullPointerException();
		
		
//		*************************** Non-Runtime Exceptions *********************************************************
		
//		Non-Runtime Exceptions / Checked Exceptions
//		Any non-runtime exceptions must be handled or declared to be thrown, if not doing so it will give compile-error
//		throw new Exception();
		throw new IOException();

//		************************************************************************************************************
	}

	static void display() throws IOException  {
//		try{
//			show();
//		}
//		catch(ArithmeticException e) {
////			this will not get executed as the exception is already handled by the show method
//			System.out.println("Display");
//		}
		throw new IOException();
	}
	
	static void show() {
		try {
			System.out.println(2/0);
		}
//		catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
		finally {
//			if we're not handling the exception here, it will go to display method and the
//			catch block of display will get executed
		}
	}
	
}
