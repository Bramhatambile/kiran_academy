package demo;

import java.util.Scanner;

public class homework {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int n=sc.nextInt();
	if(n%3==0 &&  n%5==0) {
		System.out.println("Mango and Apple");
	}else if(n%3==0) {
			System.out.println("Mango");
		
	}else if(n%5==0) {
			System.out.println("Apple");
	}
	else {
		System.out.println(n);
	}
}
}