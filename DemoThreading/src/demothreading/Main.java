package demothreading;
public class Main {
//  main is a thread in JAVA
//	garbage collector is also a thread in JAVA
	public static void main(String[] args) {
//		The first stage of any thread => thread is born
		System.out.println(Thread.currentThread().getName()); // This will given "main" => main is a THREAD
		DemoThread thread = new DemoThread();
		thread.setName("Download Thread");
		System.out.println("starting");
		thread.start();	// This stage is ready to run stage (runnable)
		DemoThread thread2 = new DemoThread();
		thread2.setName("upload Thread");
		thread2.start(); 
		System.out.println("completed");
		
	}

}
