package com.bridgelabzreverse;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rev = 0;
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		while (num != 0) {
			int remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num/10;
			
		}
		System.out.println("The reverse of the given number is: " + rev);  
	}

}
