package com.prowings.oops;

public class Upcasting                   // overriding
{
    public static void main(String[] args) 
    {
    	parent p =new child();
    	p.printData();
	}
}

class parent
{
	void printData()
	{
	System.out.println("Method of parent class");
}
}
class child extends parent
{
	void printData()
	{
		System.out.println("Method of child class");
	}
}