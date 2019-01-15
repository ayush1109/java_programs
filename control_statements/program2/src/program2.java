import java.util.*;
class program2{
	public static void main(String args[])
{
		Scanner s = new Scanner(System.in);
		int n;
		char choice;
		n = s.nextInt();
		choice = s.next();
		while((choice!="N") ||(choice!="n"))
	{
		n = s.nextInt();
		if((n<1) || (n>12))
			System.out.println("Error");
		switch(n)
		{
			case 1:
				System.out.println("The month is January");
				break;
			case 2:
				System.out.println("The month is Febuary");
				break;
			case 3:
				System.out.println("The month is March");
				break;
			case 4:
				System.out.println("The month is April");
				break;
			case 5:
				System.out.println("The month is May");
				break;
			case 6:
				System.out.println("The month is June");
				break;
			case 7:
				System.out.println("The month is July");
				break;
			case 8:
				System.out.println("The month is August");
				break;
			case 9:
				System.out.println("The month is September");
				break;
			case 10:
				System.out.println("The month is October");
				break;
			case 11:
				System.out.println("The month is November");
				break;
			case 12:
				System.out.println("The month is December");
		}
	}
}
}