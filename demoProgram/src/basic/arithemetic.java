package demo;

import java.util.Scanner;

public class arithemetic {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter Number");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("A->"+a);
		System.out.println("b->"+b);
		int c=a+b;
		System.out.println("Total->"+c);
		int d=a-b;
		System.out.println("subtraction->"+d);
		int e=a*b;
		System.out.println("multiplication->"+e);
		float f=a/b;
		System.out.println("division->"+f);
		
	}

}
