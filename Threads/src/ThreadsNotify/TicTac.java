package ThreadsNotify;

public class TicTac {
	boolean tique;

	public synchronized void tique(boolean estaExecutando) {
		if(!estaExecutando) {
			tique = true;
			notify();
			return;
		}

		System.out.println("Tique");
		tique = true;
		notify();

		while(tique) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void taque(boolean estaExecutando) {
		if(!estaExecutando) {
			tique = false;
			notify();
			return;
		}

		System.out.println("Taque");
		tique = false;
		notify();

		while(!tique) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
