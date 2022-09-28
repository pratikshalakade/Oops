package com.prowings.oops;

 class Abstraction
{
	int i;
	int j;
	String s1;
	String s2;
	
	Abstraction()
	{
		super();
		System.out.println("No args Constractor of parent invoked");
	}
	
	Abstraction(int i ,int j,String s1,String s2)
	{
		super();
		System.out.println("Parameterised Constractor of parent invoked");
		this.i=i;
		this.j=j;
		this.s1=s1;
		this.s2=s2;	
	}
}
public class AbstractClassImp extends Abstraction
{
	
	 AbstractClassImp()
	 {
		 super();
		 System.out.println("No args Constractor of child class");
		 i=20;
		 j=40;
		 s1="tanvi";
		 s2 ="Bipin"; 
	 }
	
	 AbstractClassImp (int i,int j,String s1,String s2)
	 {
		 super(i,j,s1,s2);
		 System.out.println("Parameterised Constractor of child class"); 
	 }
	   public static void main(String[] args) {
		   AbstractClassImp a=new  AbstractClassImp();
		   System.out.println(a.i);
		   System.out.println(a.j);
		   System.out.println(a.s1);
		   System.out.println(a.s2);
		   
		   
		   
		   AbstractClassImp ab=new  AbstractClassImp(30,50,"aditi","sneha");
		   System.out.println(ab.i);
		   System.out.println(ab.j);
		   System.out.println(ab.s1);
		   System.out.println(ab.s2); 
	}
}








