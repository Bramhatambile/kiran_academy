package demo;

import java.util.Scanner;

public class divisible7 {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n%7==0) {
			System.out.println("Number is divisible by 7");
		}
		else {
			System.out.println("number is not divisible by 7");
		}
	}
}
