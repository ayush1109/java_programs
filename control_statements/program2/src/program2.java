import java.util.*;
class program2{
	Scanner in = new Scanner(System.in);
      public static void main(String[] args) {
      	char choice = in.next();
      	while(choice=='Y')
	    System.out.print("Enter the number to find the respective month");
	    int n = in.nextInt();
	    if(n<1 || n>12)
	    	System.out.print("Error");
	    System.out.print("Do you want to continue(Press Y to continue and N to exit");
	    char choice = in.next();
	    if(choice=='N')
	    	System.exit(0);
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
