import java.util.*;
class SwapNumber{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("ENTER TWO NUMBERS");
int num1=sc.nextInt(); //60
int num2=sc.nextInt(); //40

num1=num1+num2;
//num1=60+40 = 100
num2=num1-num2;
//num2=100+40 = 60
num1=num1-num2;
//num1 = 100-60 = 40

System.out.println("Num1 = "+num1+" Num2 = "+num2);
}
}