package com.prowings.oops;
                                       // overloading
public class Ambiguity {

	public static void m1( long l ,double d)      //1
		{
			System.out.println("long double");
		}
	public static void m1(float f , long l)       //1
	{
		System.out.println("float long");
	}
//	public static void m1(float f,float y)        //2
//	{
//		System.out.println("float float");
//	}
//	public static void m1(int i, double d)        //2
//	{
//		System.out.println("int double");
//	}
//	public static void m1(double d, int i)        //3
//	{
//		System.out.println("double int");
//	}
//	public static void m1(double d, long l)       //3
//	{
//		System.out.println("double long");
//	}
////	public static void m1(float f,float f)        //4
////	{
////		System.out.println("float float");
////	}
////	public static void m1(int i, double d)        //4
////	{
////		System.out.println("int double");
////	}
	public static void main(String[] args) {
		Ambiguity a =new Ambiguity();
		a.m1(20,2.5);
	}

	

}
