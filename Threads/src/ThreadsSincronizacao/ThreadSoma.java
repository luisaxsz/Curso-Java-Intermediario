package ThreadsSincronizacao;

public class ThreadSoma implements Runnable {
	private String nome;
	private int[] nums;
	private static Calculadora calc = new Calculadora();

	public ThreadSoma(String nome, int[] nums) {
		super();
		this.nome = nome;
		this.nums = nums;
		new Thread(this, nome).start();
		
	}

	@Override
	public void run() {
		System.out.println(this.nome + " Iniciada");
		int soma = calc.somaArray(this.nums);	
		System.out.println("Soma: " + soma + " " + this.nome);

	}

}
