class Pyramid8{
public static void main(String args[]){

int n = 9;
for(int i=1;i<=9;i++)
{
	
	for (int j=2; j<=i; j++)
	{
		System.out.print(" ");
	}
	
	for (int j=9; j>=i; j--)
	{
		System.out.print(n+" ");
		
	}
	n--;
	System.out.println();
}


}
}