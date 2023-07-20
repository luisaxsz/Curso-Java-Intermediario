package ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ArquivosResourceBundle {

	public static void main(String[] args) {
		// 	Ler Arquivos 
		System.out.println(Locale.getDefault());
		ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
		
		System.out.println("Ola US: " + rb.getString("hello") + " " +  rb.getString("world"));
		
		Locale.setDefault(new Locale("pt_BR", "pt_BR"));
		rb = ResourceBundle.getBundle("meu-texto");
		System.out.println("Ola pt: " + rb.getString("ola") + " " + rb.getString("mundo"));
		
		
		

	}

}
