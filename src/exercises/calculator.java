package exercises;

public class calculator {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		addition a1 = new addition();
		int resultAddition = a1.add(num1, num2);
		System.out.println("Addition of " + num1 + " and " + num2 + " is " + resultAddition);
		
		subtraction s1 = new subtraction();
		int resultSubtraction = s1.sub(num1, num2);
		System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + resultSubtraction);
		
		multiplication m1 = new multiplication();
		int resultMultiplication = m1.mul(num1, num2);
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + resultMultiplication);
		
		division d1 = new division();
		double resultDivision = d1.div((double)num1, (double)num2);
		System.out.println("Division of " + num1 + " and " + num2 + " is " + resultDivision);

	}

}

class addition{
	public int add(int a,int b) {
		int c = a + b;
		return c;
	}
}

class subtraction{
	public int sub(int a,int b) {
		int c = a - b;
		return c;
	}
}

class multiplication{
	public int mul(int a,int b) {
		int c = a * b;
		return c;
	}
}

class division{
	public double div(double a,double b) {
		double c = a / b;
		return c;
	}
}

