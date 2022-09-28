package com.prowings.oops;

public class GetterSetter {
	private int i=2000;
	private String s ="pratiksha";
	
	
	public int getamount () {
		
		return i;	
	}
      
	public void setamount(int i) {
		
		this.i=i;
	}
	
	public String getname()
	{
		return s;
		
	}
	
	public void setname(String s)
	{
		this.s=s;
		
	}
	
	public static void main(String[] args) {
		GetterSetter g =new GetterSetter();
				System.out.println(g.getamount());
		        System.out.println(g.getname());
	}
	
}


