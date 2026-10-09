package com.loops;

public class Happy {

	public static void main(String[] args) {
		int num = 1234, sum = 0;
		while (num > 0) {
		    int digit = num % 10;  // Extracts the last digit (4, then 3, then 2...)
		    sum += digit;          // Adds it to total
		    num /= 10;             // Removes the last digit (1234 -> 123 -> 12...)
		}

	}

}
