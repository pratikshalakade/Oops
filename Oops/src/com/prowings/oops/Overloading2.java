package com.prowings.oops;

public class Overloading2 {
//	public static void m1(Object o)
//	{
//		System.out.println("object");
//	}
	public static void m1(Integer i)
	{
		System.out.println("Integer");
	}
//	public static void m1(String s)
//	{
//		System.out.println("String");
//	}
//	public static void m1(Number n)
//	{
//		System.out.println("number");
//	}
	public static void main(String[] args) {
		Overloading2 o = new Overloading2();
		
		o.m1(null);
	}

}
