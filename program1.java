import java.util.*;
class program1{
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
	int num1;
	int num2;
	System.out.printf("Enter two numbers");
	num1 = s.nextInt();
	num2 = s.nextInt();
	System.out.printfln("The addition of the two numbers is " + (num1 + num2));
	System.out.printfln("The subtraction of the two numbers is " + (num1 - num2));
	System.out.printfln("The dividion of the two numbers is " + (num1 / num2));
	System.out.printfln("The multiplication of the two numbers is " + (num1 * num2));
	System.out.printfln("The modulous of the two numbers is " + (num1 % num2));

	}
}