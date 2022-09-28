package com.prowings.oops;
                                          //overriding
public class Ad5 {
	 int m1()
	   {
		   int a,b,c;
		   a=10;b=20;
		   c=a+b;
		   System.out.println(c);
		  
		   return c;
		   
	   }
	}
	  class c extends Ad5
	 {
		 int m1()
		 {
			int a,b,c,d;
			a=10;b=20;c=20;
			d=a+b+c;
			System.out.println(d);
			return d;
			 
			 
		 }
		 
		 public static void main(String[] args) {
			c x = new c ();
			x.m1();
		} 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
}
