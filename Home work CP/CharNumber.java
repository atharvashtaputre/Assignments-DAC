
import java.util.*;	
class CharNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character:");
		char c=sc.next().charAt(0);
				
			switch(c)
			{
				case 'M':
						System.out.println("THIS IS Monday");
					break;
				
				case 'T':
						System.out.println("THIS IS Tuesday");
					break;
					
				case 'W':
						System.out.println("THIS IS Wednesday");
					break;
					
				case 't':
						System.out.println("THIS IS Thursday");
					break;
					
				case 'F':
						System.out.println("THIS IS Friday");
					break;	
					
				case 'S':
						System.out.println("THIS IS Saturday");
					break;

				case 's':
						System.out.println("THIS IS Sunday");
					break;			
					
				
				default:
					System.out.println("Wrong Choice!!!!!");
					break;
				}
			
		}
	}	
	