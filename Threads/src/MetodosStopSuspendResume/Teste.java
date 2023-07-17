package MetodosStopSuspendResume;

public class Teste {

	public static void main(String[] args) {
		MinhaThread thread = new MinhaThread("#1");
		MinhaThread thread2 = new MinhaThread("#2");
		// Pausa thread
		thread.suspend();

		try {
			Thread.sleep(900);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Suspende thread 2
		thread2.suspend();
		// Resume thread 1
		thread.resume();

		// Para a thread
		thread2.stop();

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Resume thread 2
		thread2.resume();
	}

}
