package com.prowings.oops;

public class Overloding3 {

//	public void m1(int i,int j) {
//		System.out.println("int int");
//	}
//
//	public void m1(int i,double d) {
//		System.out.println("int double");
//	}

//	public void m1(float i,float j) {
//		System.out.println("float float");
//	}

//	public void m1(float i,int j) {
//		System.out.println("float int");
//	}
	public void m1(float...f) {
		System.out.println("float");
	}
	public void m1(int...i) {
		System.out.println("int");
	}
//	public void m1(int i , String...s) {
//		System.out.println("int string");
//	}

	public static void main(String[] args) {
		Overloding3 o=new  Overloding3();
	//	   o.m1(10, 300);
	 //      o.m1(20, 29.4f);
	      o.m1(-10,20,-30,40);
	//	   o.m1(10,"Renu");
	}
	

}
