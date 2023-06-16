package exercises;

public class typeCasting {

	public static void main(String[] args) {
		// Type casting means converting the type of the datatype
		// There are 2 types of type casting namely implicit and explicit
		// implicit conversion - No need to mention the destination data type to be converted
		// implicit conversion - Need to mention the destination data type to be converted
		
		System.out.println("Implicit Type Casting");
		
		char a = 'A';
		System.out.println("Value of char a is " + a);
		
		int b = a;
		System.out.println("Value of int b is " + b);
		
		float c = a;
		System.out.println("Value of float c is " + c);
		
		double d = a;
		System.out.println("Value of double d is " + d);
		
		long e = a;
		System.out.println("Value of long e is " + e);
		
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		
		double x = 45.5;
		System.out.println("Value of double x is " + x);
		
		int y = (int)x;
		System.out.println("Value of int y is " + y);
		

	}

}
