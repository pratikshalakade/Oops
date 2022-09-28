package com.prowings.oops;

public class Overloding4 {
	
		 public void m1(Number n)
		 {
			System.out.println("no prg");	
		 }
//		public void m1(Integer i)
//	{
//			System.out.println("prg");		
//	}
		
		public void m1(Long l)
		{
				System.out.println("long prg");
		}
		
		public void m1(Object b)
		{
		  System.out.println("object ags");	
		}
		public void m1(int...n)
		{
		  System.out.println("var arg");	
		}
		
          public static void main (String ags[])
          {
        	  Overloding4  t= new  Overloding4 ();
        	 // t.m1();
        	 t.m1(10);
        	//  t.m1(10.5);  
          }	    
          }

