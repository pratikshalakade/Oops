package com.prowings.oops;

public class Encapsulation {
	                                        //Renu
	private String s ="Jaydeep";
	private int i=23000000;


 public String getname()
 {
	 return s; 
 }
 public void setname(String s) 
 {
	 this.s=s;
 }
 
 public int getamount()
 {
	return i;  
 }
 public void setamount(int i) 
 {
	 this.i=i; 
 }
 
 public static void main(String[] args) {
	 Encapsulation e=new Encapsulation();
	 
	 System.out.println(e.getname());
	 System.out.println(e.getamount());
	 
}
}