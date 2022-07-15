package com.java.project;

public class Test2 {

	public static void m1(int...x) {
		System.out.println("var-arg");
	}
	
	public static void m1(int x) {
		System.out.println("genral");
	}
	public static void main(String[] args)
	{
		m1();
		m1(10,20);
		m1(10);
	}
}
