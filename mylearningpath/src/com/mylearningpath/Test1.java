package com.mylearningpath;

public class Test1 {
	static void method1() {
		Test1 t = new Test1();
		t.method2();
		System.out.println("method 1 called");
	}
	void method2() {
		method3();
		System.out.println("method 2 called");
	}
	static void method3() {
		System.out.println("method 3 called");
	}
	void method4() {
		System.out.println("method 4 called");
	}
	static void method5() {
		method3();
		System.out.println("method 5 called");
		
	}
	void method6() {
		System.out.println("method 6 called");
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		method1();
		method5();
		
		System.out.println("main method ended");
	}
}
