package Autoboxing;

public class Teste {

	public static void main(String[] args) {
		//Autoboxing
		Short num7 = 10;
		Byte num8 = 2;
		Integer num9 = 1;
		Double num10 = 1.6;
		//Unboxing
		int num1 = num7;
		num7.intValue();
		
		//Auto unboxing num9 -> autoboxing num13/num9 => num14
		Integer num14 = num1/num8;

	}

}
