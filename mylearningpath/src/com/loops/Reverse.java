package com.loops;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
System.out.println("enter a number to reverse");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int reverse= sumofreverse(n);
//if(n ==reverse) {
//	System.out.println("the number is palindrome");}
//	else {
//		System.out.println("the number is not palindrome");
//	}
System.out.println(reverse);
}
	private static int sumofreverse(int n) {
		
		int sum = 0;
		int r = 0;
		while(n>0) {
			r = n%10;
			n = n/10;
			sum = sum*10 + r;
			
		}
		return sum;
	}

}
