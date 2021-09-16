
public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		new ArithmeticException(); // It is possible to create objects of exception class explicitly
		
		try{
//			try block / Guarded Region => contains all doubtful statements
//			one try block can have any number of catch blocks depending upon the number of exceptions
			System.out.println("Before Exception");
			System.out.println(args[0]); // Array Index Out of bound Exception
			System.out.println(2/0); // Arithmetic exception
			System.out.println("Hello"); // this statement will not get executed
//			No statement in the try block will get executed after the exception is found
		}
		
//		*************************** Specific catch blocks *************************************************
		
		catch(ArithmeticException e) {
//			handle the exception
//			try to rectify and give user friendly message to the user
//			specific catch block
			System.out.println(e.toString());
			System.out.println("Cannot Divide By Zero");
			e.printStackTrace(); // print the stack trace of the throwable object
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
//			catch block for exception : args[0]
//			specific catch block
			e.printStackTrace();
		}
		
//		***************************Generic Catch Block *******************************************************
		
		catch(Exception e) {
//			dynamic polymorphism working here
//			exception is a super class of all other exceptions
//			this catch block is capable of handling all other exceptions
//			generic catch block
//			Generic block must be at the end otherwise the specific catch block will become unreachable
			e.printStackTrace();
		}
		
//		*******************************************************************************************************
		
//		System.out.println("Hello"); // no guarantee if this line will execute or not => 
//		if we return from the catch block, then line above line will not get executed
	
//		**************************** finally block ************************************************************
		
		finally {
//			finally block will always execute
//			This block contains all the statements which must always executes 
//			example : releasing the resources such as files, database connection
			System.out.println("After");
		}
		
//		*******************************************************************************************************
		
	}

}
