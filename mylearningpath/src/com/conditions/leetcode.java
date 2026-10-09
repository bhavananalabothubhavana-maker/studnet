package com.conditions;
import java.util.Scanner;

public class leetcode {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        int[] num = {2, 7, 11, 15};

		        System.out.print("Enter target: ");
		        int n = sc.nextInt();

		        for (int i = 0; i < num.length; i++) {

		            for (int j = i + 1; j < num.length; j++) {

		                if (num[i] + num[j] == n) {
		                    System.out.println("[" + i + ", " + j + "]");
		                    return;
		                }
		            }
		        }
		    }


	}

