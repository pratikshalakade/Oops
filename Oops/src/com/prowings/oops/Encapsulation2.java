package com.prowings.oops;

public class Encapsulation2
{
	private double d = 20.3;
	private int i = 12;
	private char c = 'R';
	
	public double getdouble()
	{
		return d;
	}
	public void setdouble(double d)
	{
		this.d=d;
	}
	public int getint()
	{
		return i;
	}
	public void setint(int i)
	{
		this.i=i;
	}
	public char getchar()
	{
		return c;
	}
	public void setchar(char c)
	{
		this.c=c;
	}
	public static void main(String[] args)
	{
		Encapsulation2 e= new Encapsulation2();
		
		System.out.println(e.getdouble());
		System.out.println(e.getint());
		System.out.println(e.getchar());
		
	}

}
