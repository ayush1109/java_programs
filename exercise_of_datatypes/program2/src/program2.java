import java.util.*;
class program2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num1;
		int num2;
		float n3;
		float n4;
		char ch1;
		char ch2;
		System.out.println("Enter the two integer numbers");
		num1 = s.nextInt();
		num2 = s.nextInt();
		System.out.println("Enter the two float numbers");
		n3 = s.nextFloat();
		n4= s.nextFloat();
		System.out.println("Enter the two Character numbers");
		ch1 = s.next().charAt(0);
		ch2 = s.next().charAt(0);
		System.out.println("For Int :");
		System.out.println("The addition of the two numbers is " + (num1 + num2));
	System.out.println("The subtraction of the two numbers is " + (num1 - num2));
	System.out.println("The dividion of the two numbers is " + (num1 / num2));
	System.out.println("The multiplication of the two numbers is " + (num1 * num2));
	System.out.println("The modulous of the two numbers is " + (num1 % num2));
	System.out.println("For Float :");
	System.out.println("The addition of the two numbers is " + (n3 + n4));
	System.out.println("The subtraction of the two numbers is " + (n3 - n4));
	System.out.println("The dividion of the two numbers is " + (n3 / n4));
	System.out.println("The multiplication of the two numbers is " + (n3 * n4));
	System.out.println("The modulous of the two numbers is " + (n3 % n4));
	System.out.println("For Character :");
	System.out.println("The addition of the two Characters is " + (ch1 + ch2));
	System.out.println("The subtraction of the two Characters is " + (ch1 - ch2));
	System.out.println("The dividion of the two Characters is " + (ch1 / ch2));
	System.out.println("The multiplication of the two Characters is " + (ch1 * ch2));
	System.out.println("The modulous of the two Characters is " + (ch1 % ch2));
	}
}