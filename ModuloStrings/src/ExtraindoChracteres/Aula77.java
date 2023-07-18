package ExtraindoChracteres;

public class Aula77 {

	public static void main(String[] args) {
		String java = "Java";
		
		for (int i = 0;i < java.length(); i++) {
			System.out.println(java.charAt(i));
		}
		
		//Método getChars -> atribui caracteres da String a array de chars
		
		char[] jav = new char[3];
		
		//indicie inicial indicie final,destino,Inicio
		java.getChars(0, 3, jav, 0);
		System.out.println(jav);
		
		//Transformar String em array 
		char[] javaChars = java.toCharArray();
		System.out.println(javaChars);
		
		
		
	}

}
