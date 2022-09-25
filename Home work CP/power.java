import java.util.Scanner;
class power
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
	  System.out.println("ENTER BASE");
	  int base = sc.nextInt();
	  System.out.println("ENTER POWER");
      int power = sc.nextInt();
	  int  temp = base;
	  for(int i=1 ; i<power ; i++)
	  {
	     temp = temp*base;
	  }
	  System.out.println(temp);
   }
}