package ExercicioSemafaro;

public class ThreadSemafaro implements Runnable {
	private CorSemafaro cor;
	private boolean para;
	boolean corMudou;

	public ThreadSemafaro() {
		this.cor = CorSemafaro.VERMELHO;
		new Thread(this).start();
	}

	@Override
	public void run() {
		while(!para) {
			switch(this.cor) {
			case VERMELHO: try {
					Thread.sleep(900);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}break;
			case AMARELO: try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}break;
			case VERDE: try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}break;
			}
			this.mudarCor();
		}
	}
	
	public synchronized void parar() {
		this.para = true;
	}
	
	public synchronized void mudarCor() {
		switch (this.cor) {
		case VERMELHO:
			this.cor = CorSemafaro.VERDE;
			;
			break;
		case VERDE:
			this.cor = CorSemafaro.AMARELO;
			;
			break;
		case AMARELO:
			this.cor = CorSemafaro.VERMELHO;
			;
			break;
		}
		this.corMudou = true;
		notify();
	}
	
	public synchronized void esperaCor() {
		while(!corMudou) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.corMudou = false;
	}

	public CorSemafaro getCor() {
		return cor;
	}

	public void setCor(CorSemafaro cor) {
		this.cor = cor;
	}
	
	
}
