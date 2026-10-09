package com.conditions;
import java.util.Scanner;
public class FoodOrderSystem {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int choice, quantity;
    int price = 0;
    String item = "";
System.out.println("FOOD MENU");
System.out.println("1. Pizza   - ₹200");
System.out.println("2. Burger  - ₹120");
System.out.println("3. Biryani - ₹180");
System.out.println("4. Noodles - ₹100");
	System.out.println("\nenter your choice");
	int Choice=sc.nextInt();
	String Item = " ";
	int Price = 0;
	switch(Choice) {
	case 1:
		Item = "pizza";
		Price = 120;
		break;
	case 2:
		Item="Burger";
		Price=120;
		break;
	case 3:
		Item = "Briyani";
		Price = 180;
		break;
	case 4 :
		Item = "Noddles";
		Price = 100; 
		break;
		default:
		System.out.println("enter invalid choice");
		return;
	}
		int Qunatity = sc.nextInt();
		int TotalBill=Price * Qunatity;
		System.out.println("enter bill");
		System.out.println("selected item : " +Item);
		System.out.println("selected price: " +Price);
		System.out.println("selected quantity:" +Qunatity);
		System.out.println("totalbill:" + TotalBill);
		sc.close();
	}
	}

		
		
		
		
		
	
	
	


