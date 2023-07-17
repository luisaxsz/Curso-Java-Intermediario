package ThreadsNotify;

public class Teste {

	public static void main(String[] args) {
		TicTac tt = new TicTac();
		ThreadTiqueTaque tic = new ThreadTiqueTaque(tt , "Tique");
		ThreadTiqueTaque tac = new ThreadTiqueTaque(tt , "Taque");
		
		try {
			tic.t.join();
			tac.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
