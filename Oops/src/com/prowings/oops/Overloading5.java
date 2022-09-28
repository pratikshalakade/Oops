package com.prowings.oops;

public class Overloading5 {

	public static void main(String[] args) {
		Overloading5 o =new Overloading5();
		o.m2(10,20);
	}

	void m2(int i ,float f) 
	{ 
		System.out.println("hii");
	}
	void m2(float i ,float f)
	{
		System.out.println("byee");
	}
}
