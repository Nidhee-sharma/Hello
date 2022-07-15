package com.java.project;

public class Test3 {

	public static void m1(int[]... x) {
		
		for(int[] x1:x) {
			System.out.println(x1[0]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {10,20,30};
int[] b= {40,30,40};
m1(a,b);
	}

}
