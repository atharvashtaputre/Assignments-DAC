



class Downcasting
{
	  void Narrow()
	  {
		  System.out.println();
		  System.out.println();
		  System.out.println("		DOWNCASTING		");
		  System.out.println();
		  System.out.println();
  
		  int i;
		  long l;
		  short sh;
		  byte b;
		     sh = 327;b=0;
		  System.out.println("Downcasting short to byte : "+(b=(byte)sh));
		     i = 894;
		  System.out.println("Downcasting int to byte : "+(b=(byte)i));
		     l = 995l;
		  System.out.println("Downcasting long to byte : "+(b=(byte)l));
		         
		  System.out.println("Downcasting int to short : "+(sh=(short)i));
		   
		  System.out.println("Downcasting long to short : "+(sh=(short)l));
		  
		  System.out.println("Downcasting long to int : "+(i=(int)l));
	      
	  }
	  
	  void flt()
	  {
		  float f = 0.0f;
		  double d=3434344.544;
		  System.out.println();
		  System.out.println();
		  
		  System.out.println("Downcasting double to flt : "+(f=(float)d));
	  }
	  
	  void miscle()
	  {
		  byte b=65;
		  char ch=' ';
		  short s=0;
		  System.out.println();
		  System.out.println();
		  System.out.println("downcasting ( byte to char): "+(ch=(char)b));
		  System.out.println("downcasting ( char to short): "+(s=(short)ch));
		  
	  }
	  
	  
}


class Upcasting
{   
   
   void Int()
     {
		System.out.println();
		System.out.println();
		System.out.println("		UPCASTING	");
		System.out.println();
		System.out.println();
	   
	   byte b =127;
	   short sh ;
	   int i;
	   long l;
	   float f ;
	   char ch; 
	   
	   System.out.println("Upcasting of ( byte to short) : "+(sh=b));
	   System.out.println("Upcasting of ( short to int) : "+(i=sh+5124));
	   System.out.println("Upcasting of ( int to long) : "+(l=i+21364));
	   System.out.println("Upcasting of ( byte to float) : "+(f=b+6231f));
	   System.out.println("Upcasting of ( int to float) : "+(f=i));
	   System.out.println("Upcasting of ( long to float) : "+(f=l));
	   System.out.println("\n\n");
	   ch = 'a';
	   System.out.println("Upcasting of ( char To int): "+(i=ch));
	   System.out.println("Upcasting is not possible  ( byte to char)");
	   System.out.println("Upcasting is not possible  ( char to short)");
	  }
     
	 void flt()
     {
		 System.out.println("\n\n");
	   float f = 678.789f;
       double d ;    
	   System.out.println("this is upcasting of ( float to double) : "+(d=f));
     }
	
	
}

class Casting
{
    public static void main(String args[] )
	{
	   Upcasting u1 = new Upcasting();
           u1.Int();
           u1.flt();
        
		   
		   Downcasting d1 = new Downcasting();
	         d1.Narrow();
			 d1.flt();
			 d1.miscle();
	}   
}