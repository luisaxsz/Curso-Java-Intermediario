package Threads;

public class Teste {

	public static void main(String[] args) {
		MinhaThread thread = new MinhaThread("Thread #1", 600);
		//thread.start();
		
		MinhaThread thread2 = new MinhaThread("Thread #2", 900);
		
		MinhaThread thread3 = new MinhaThread("Thread #3", 500);
		
		MinhaThread2 threadRunnable1 = new MinhaThread2("Thread Runnable #1", 500);
		//Thread t1 = new Thread(threadRunnable1);
		//t1.start();
		
		MinhaThread2 threadRunnable2 = new MinhaThread2("Thread Runnable #2", 300);
	}

}
