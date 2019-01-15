import java.util.*;
class Date{
	int month;
	int day;
	int year;
	Date()
	{
		month = 1;
		day = 1;
		year = 2000;
	}
	Date(int month, int day, int year)
	{
		this.month = month;
		this.day = day;
		this.year = year;
	}
	void displayDate()
	{
		System.out.print("Date is " + day);
		System.out.print("/");
		System.out.print(month);
		System.out.print("/");
		System.out.print(year);
		System.out.print("\n");		
	}

}
public class datetest{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Date d1 = new Date();
		d1.displayDate();
		
		System.out.println("Enter Date :");
		int day = in.nextInt();
		System.out.println("Enter Month :");
		int month = in.nextInt();
		System.out.println("Enter year :");
		int year = in.nextInt();
		Date d2 = new Date(day, month, year);
		d2.displayDate();







			}
}