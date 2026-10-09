package com.loops;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println("main method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int sumofdigits= sumofdigits(n);
		System.out.println("sum of digits: " + sumofdigits);
				
	}
	
	
		static	int sumofdigits(int n){
				int sum = 0;
				int r =0;
				while(n>0) {
			r = n%10;
			n=n/10;
			sum= sum+r;
				}// TODO Auto-generated method stub
		return sum;
	}
		}

		
