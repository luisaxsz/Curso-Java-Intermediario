package Threads;

public class MinhaThread2 implements Runnable {
	private String nome;
	private int tempo;

	public MinhaThread2(String nome, int tempo) {
		super();
		this.nome = nome;
		this.tempo = tempo;
		Thread thread = new Thread(this);
		thread.start();
	}
	
	public void run() {
		for(int i = 0 ; i < 6; i++) {
			System.out.println("Contador " + this.nome + " " +  i);
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		}
		
		System.out.println(nome + " Finalizou execucao");
	}
}
