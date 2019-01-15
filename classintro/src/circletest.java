import java.util.*;
class circle{
	int raidus;
	final double PI = 3.14;
    circle()
    {
    	raidus = 1;
    }
    circle(int raidus)
    {
    	this.raidus = raidus;
    }
    void area()
    {
    	System.out.println("Area is " + (PI*raidus*raidus));
    }
    void circumference()
    {
    	System.out.println("Circumference is " + (PI*raidus*2));
    }
    void display()
    {
    	System.out.println("Raidus is " + raidus);
    	area();
    	circumference(); 
    }
}
    public class circletest{
    	 public static void main(String[] args) {
    	 	Scanner in = new Scanner(System.in);
    	 	circle c1 = new circle();
    	 	c1.display();

    	 	System.out.print("Enter the radius :");
    	 	int raidus = in.nextInt();
    	 	circle c2 = new circle(raidus);
    	 	c2.display();

    		
    	}

    }

