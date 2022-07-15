package com.java.project;

public class Test {

	public static void m1(int ... x) {
		System.out.println("numbers of arguments we are passing"  + x.length);
		
	}
	
	public static void main(String[] args) {
		m1(10);
		m1(10,20);
		m1(10,20,30);
		m1(10,30,40,60);
	}
}