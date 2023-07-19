package Math;

public class ClasseMath {
	public static void main(String[] args) {
		System.out.println(Math.pow(2, 2));
		//Arredonda valor
		//Arredonda para cima
		System.out.println(Math.ceil(4.5));
		//Arredonda para cima 4.5 
		System.out.println(Math.round(4.7));
		//Arredonda para baixo
		System.out.println(Math.floor(4.8));
		//Num aleatorio - 0 a 1 
		//*10 -> Ate qual numero queremos ir
		System.out.println(Math.round(Math.random()*10));
		//Funções trigonometricas
		System.out.println(Math.sin(Math.toRadians(30)));
		System.out.println(Math.cos(Math.toRadians(1)));
		System.out.println(Math.tan(Math.toRadians(45)));
		//Java não é tao seguro com operações matematicas -> bigNumber/bigDecimal
	}
}
