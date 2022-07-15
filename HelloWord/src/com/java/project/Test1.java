package com.java.project;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum();
		sum(10,20);
		sum(30,40,20);
		
	}
	
	public static void sum(int...x ) {
		int total=0;
		for(int x1:x) {
			total=x1+total;
			
		}
		System.out.println("hhhh   " +   total);
	}

}
