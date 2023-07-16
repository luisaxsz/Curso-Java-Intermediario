package Aula66;

public class Teste {
	
	public static void obterMemoriaUsada() {
		
		final int MB = 1024*1024;
		
		Runtime runtime = Runtime.getRuntime();
		
		System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);
	}

	public static void main(String[] args) {
		Contato[] contatos = new Contato[100000];
		Contato contato;
		for(int i = 0; i < contatos.length; i++) {
			contato = new Contato("Contato" + i, "0000-000" + i, "Contato"+ i+ "@email.com");
			
			contatos[i] = contato;
		}

		System.out.println("Contatos Criados");
		obterMemoriaUsada();
		
		contatos = null;
		
		Runtime.getRuntime().runFinalization();
		Runtime.getRuntime().gc();
		
		System.out.println("Contatos removidos da memoria");
		
		obterMemoriaUsada();

	}

}
