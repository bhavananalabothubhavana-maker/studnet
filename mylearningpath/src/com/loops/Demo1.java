package com.loops;
import java.util.Scanner;
public class Demo1 {

	public static void main(String[] args) {
	System.out.println("main method Started");
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int fact = 1;
	int n = sc.nextInt();
	for(int i =1;i<=n;i++){
		fact = fact *i;
		return;
		
	}

	}

}
