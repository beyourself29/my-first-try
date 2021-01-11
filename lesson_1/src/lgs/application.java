package lgs;

public class application {

	public static void main(String[] args) {
		
		// Завдання 1
		boolean a;
		char b;
		byte c;
		short d;
		int f;
		long l;
		float t;
		double u;
		
		// Завдання 2
		System.out.println("boolean 1 = " + Boolean.TRUE);
		System.out.println("boolean 2 = " + Boolean.FALSE);
		System.out.println("char min = " + Character.MIN_VALUE);
		System.out.println("char max = " + Character.MAX_VALUE);
		System.out.println("byte min = " + Byte.MIN_VALUE);
		System.out.println("byte max = " + Byte.MAX_VALUE);
		System.out.println("short min = " + Short.MIN_VALUE);
		System.out.println("short max = " + Short.MAX_VALUE);
		System.out.println("int min = " + Integer.MIN_VALUE);
		System.out.println("int max = " + Integer.MAX_VALUE);
		System.out.println("long min = " + Long.MIN_VALUE);
		System.out.println("long max = " + Long.MAX_VALUE);
		System.out.println("float min = " + Float.MIN_VALUE);
		System.out.println("float max = " + Float.MAX_VALUE);
		System.out.println("double min = " + Double.MIN_VALUE);
		System.out.println("double max = " + Double.MAX_VALUE);
		System.out.println("");
		
		// Завдання 3
		int [] array = {4, 67, -766, 12, -54, 1234, 46789, 6, 0, 7};
		int min = 0;
		int max = 0;

		for (int n = 0; n < array.length; n++) {
			if (array[n] < min) 
				min = array[n];
			if (array[n] > max) 
				max = array[n];	
		}
		
		System.out.println("мінімальне значення = " + min);
		System.out.println("максимальне значення = " + max);

		
		
		
	}
}
