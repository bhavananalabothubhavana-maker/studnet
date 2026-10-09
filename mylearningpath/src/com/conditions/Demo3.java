package com.conditions;
import java.util.Scanner;
public class Demo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age= sc.nextInt();
		if(age>=18) {
			System.out.println("your eligible for voting");
		}
		else {
			System.out.println("your not eligible");
		}
		}
		
	}
	
		
		