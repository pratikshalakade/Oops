package com.prowings.oops;

public class Overriding {
		 
	    public static void main(String[] args) 
	    {
	        Shape s = new Circle();
	 
	        s.draw();
	        s.fill();
	    }
	}
	 
	class Shape{
	    protected void draw()
	    {
	        System.out.println("Shape");
	    }
	     
	    public void fill()
	    {
	        System.out.println("Shape Filled with color");
	    }
	 
	}
	 
	class Circle extends Shape{
	    public void draw()
	    {
	        System.out.println("Circle");
	    }
//	    public void fill()
//	    {
//	    	System.out.println("Renu tai");
//	    }
	}
	 
	class Square extends Shape{
	    public void draw()
	    {
	        System.out.println("Square");
	    }
	}
	 
	class Hexagon extends Shape{
	    public void draw()
	    {
	        System.out.println("Hexagon");
	    }
	}

