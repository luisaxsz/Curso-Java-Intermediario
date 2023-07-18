package Tokenizer;

import java.util.StringTokenizer;

public class Aula84 {

	public static void main(String[] args) {
		// Extrair informações de uma super string 
		//extrair tokens da String
		
		String doArquivo = "1;Antonio;30;";
		//jva util -> string de onde que extrair informações e limitador
		//leitura de arquivos
		StringTokenizer st = new StringTokenizer(doArquivo, ";");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		

	}

}
