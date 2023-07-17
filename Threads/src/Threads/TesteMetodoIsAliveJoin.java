package Threads;

public class TesteMetodoIsAliveJoin {

	public static void main(String[] args) {
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", 200);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", 500);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 900);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		t2.start();
		t3.start();

		// Mostrar essa mensagem apos finalizacao
		// System.out.println("Programa finalizado");

		// Teste 1

		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Teste 2

		while (t1.isAlive() || t2.isAlive() || t3.isAlive()) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Programa finalizado");

		// Teste 3 -> pede para esperar a execucao das threads
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Programa finalizado");
	}

}
