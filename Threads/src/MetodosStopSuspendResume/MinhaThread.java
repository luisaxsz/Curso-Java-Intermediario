package MetodosStopSuspendResume;

public class MinhaThread implements Runnable {
	private String nome;
	private boolean estaSuspensa;
	private boolean foiTerminada;

	public MinhaThread(String nome) {
		super();
		this.nome = nome;
		this.estaSuspensa = false;
		this.foiTerminada = false;
		new Thread(this, nome).start();
	}

	@Override
	public void run() {
		System.out.println("Executando " + this.nome);
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println(this.nome + " Executando " + i);
				Thread.sleep(200);
				synchronized(this) {
					while(estaSuspensa) {
						wait();
					}
					if(this.foiTerminada) {
						break;
					}
				};
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(this.nome + " Terminada");

	}
	
	void suspend() {
		this.estaSuspensa = true;
	}
	
	synchronized void resume() {
		this.estaSuspensa = false;
		notify();
	}
	
	synchronized void stop() {
		this.foiTerminada = true;
		notify();
	}

}
