package Wrappers;

public class TesteWrappers {

	public static void main(String[] args) {
		short num1 = 1;
		byte num2 = 2;
		int num3 = 3;
		long num4 = 10000;
		float num5 = 3.5f;
		double num6 = 4.5;
		boolean flag = true;
		char a = 'a';
		
		Short num7 = new Short(num1);
		Byte num8 = new Byte(num2);
		Integer num9 = new Integer(num3);
		Double num10 = new Double(num6);

		Double num11 = new Double("11.5");
		System.out.println(num11);
		System.out.println(num11.doubleValue());
	}

}
