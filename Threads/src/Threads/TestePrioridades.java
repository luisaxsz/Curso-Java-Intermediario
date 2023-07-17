package Threads;

public class TestePrioridades {

	public static void main(String[] args) {
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", 500);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 500);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		 
		t1.start();
		t2.start();
		t3.start();
		
		t1.setPriority(3);
		t2.setPriority(2);
		t3.setPriority(1);
		
		

	}

}
