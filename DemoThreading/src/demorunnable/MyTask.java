package demorunnable;

public class MyTask implements Runnable{
/*
 * Run method contains job(task/work to be done by thread) to be done by thread
 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Performing Some Task " + Thread.currentThread().getName());
		try {
			Thread.sleep(1200); // unhandled exception by sleep method can only be handled by try-catch because 
//									we can't use throws here as run method is overridden, we can't change it's signature
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("completed Some Task " + Thread.currentThread().getName());
	}
	
}
