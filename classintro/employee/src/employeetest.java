import java.util.*;
class employeetest{
	public static void main(String[] args) {
		employee e1[];
		Scanner in = new Scanner(System.in);
		int numberEmployess;
		int i;

		System.out.print("Enter the number of Employees :");
		numberEmployess = in.nextInt();

		e1 = new employee[numberEmployess];

		for(i=0;i<numberEmployess;++i)
		{
			System.out.println("Enter Employee Details for Employee : " + 
				e1[i].name = in.nextline();
				e1[i].yearJoining = in.nextInt();
				e1[i].salary = in.nextDouble();
				e1[i].address = in.nextline();

		}
		for(i=0;i<numberEmployess;++i)
			display();
	}
}