package demothreading;

public class DemoThread extends Thread{
	@Override
	public void run() {
//		Whenever CPU is free, run method will get executed
//		Running stage	
		
		String name = Thread.currentThread().getName();
//		System.out.println(name);
		System.out.println("Started performing background task " + name);
		System.out.println("Completed performing background task " + name);
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	// Terminate/kill thread
}
