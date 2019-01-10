import java.util.*;
class program4{
	public static void main(String args[]){
		long minute = 6786567;
		float year = minute/525600f;
		float months = minute/43800f;
		float days = minute/1440f;
	System.out.println("Total number of years are:" + year);
	System.out.println("Total number of months are:" + months);
	System.out.println("Total number of days are:" + days);
			}
}