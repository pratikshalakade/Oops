package com.prowings.oops;

public class Downcasting
{
	 public static void main(String[] args) 
	    {
	    	parent1 p =new child1();
	    	child1 c = (child1) p;
	    	p.Show();
	    	p .draw();
		}
	}

	class parent1
	{
		void Show()
		{
		System.out.println("Method of parent class");
	}
          void draw()
		{
			System.out.println("renu");
		}
	}
	class child1 extends parent1
	{
		  void Show()
		{
			System.out.println("Method of child class");
		}
	      void draw()
		{
			System.out.println("pratiksha");
		}

}
