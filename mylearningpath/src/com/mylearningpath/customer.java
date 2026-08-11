package com.mylearningpath;

public class customer {
	
	void m1() {
		System.out.println("m1 called");
	}
@Override
protected void finalize() throws Throwable {
	System.out.println("finalize called");
	
}
	public static void main(String[] args) {
		System.out.println("main method started");
		customer c1 = new customer();
		System.out.println(c1);
		customer c2 = new customer();
		System.out.println(c2);
		c1= null;
		c2= null;
		System.gc();
		c2=c1;
		new customer().m1();
		System.out.println(c1);
		System.out.println(c2);
		
		
		
		

	}

}
