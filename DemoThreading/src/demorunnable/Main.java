package demorunnable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Default priority of thread = 1
		 * Default priority of a thread is determined by the thread's  priority who is creating the thread
		 */
		Thread.currentThread().setPriority(1);
		MyTask task = new MyTask();
//		Thread worker = new Thread(task);
		System.out.println(Thread.currentThread().getPriority()); // Main method has priority of 5
		Thread worker = new Thread(task, "Demo"); // specifying name to thread while creating
		System.out.println(worker.getPriority());
		System.out.println(worker.isAlive()); //not alive during born and after terminated
		worker.start();// start method is only called by object of Thread
		System.out.println(worker.isAlive()); 
		Thread worker2 = new Thread(task, "Demo2");
//		worker2.setPriority(9);
		worker2.start(); 
	}

}
