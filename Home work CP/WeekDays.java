import java.util.*;
 enum Days {
    monday,
    tuesday,
    wednesday,
    thursday,
    friday,
    saturday,
    sunday;
}

class WeekDays {
 
    // Driver method
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of ENum:");
		String s=sc.nextLine();
        Days x = (Days.valueOf(s.toLowerCase()));
		switch(x)
		{
			case monday:
				System.out.println("You Have Choose Monday");
				break;
			
			case tuesday:
				System.out.println("You Have Choose tuesday");
				break;
				
			case wednesday:
				System.out.println("You Have Choose wednesday");
				break;	
				
			case thursday:
				System.out.println("You Have  Choose thursday");
				break;	
				
			case friday:
				System.out.println("You Have  Choose FRIDAY");
				break;	
					
			case saturday:
				System.out.println("You Have Choose saturday");
				break;			

			case sunday:
				System.out.println("You Have Choose sunday");
				break;			
				
			default:
				System.out.println("Invalid Case");
				break;
				
		}	
        
    }
}