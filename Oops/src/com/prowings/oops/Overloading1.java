package com.prowings.oops;

public class Overloading1 {
//	public static void m1(int i)
//	{
//		System.out.println("int");
//	}
//	public static void m1(long l)
//	{
//		System.out.println("long");
//	}
//	public static void m1(double d)
//	{
//		System.out.println("double");
//	}
	public static void m1(byte b)
	{
		System.out.println("byte");
	}
	public static void m1(short s)
	{
		System.out.println("short");
	}
//	public static void m1(float f)
//	{
//		System.out.println("float");
//	}
	public static void m1(Character c)
	{
		System.out.println("Character");
	}
	public static void m1(String s)
	{
		System.out.println("string");
	}
	public static void m1(Object o)
	{
		System.out.println("object");
	}
	public static void m1(Number n)
	{
		System.out.println("number");
	}
	public static void main(String[] args) 
	{
		Overloading1 o =new Overloading1();
		
//		byte b =23;
    	o.m1('a');
//		o.m1(100);	
	}
}
