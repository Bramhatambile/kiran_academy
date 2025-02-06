package demo;

import java.util.Scanner;

public class areaoftrangle {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of height");
		int a=sc.nextInt();
		System.out.println("enter the value of base");
		double b=sc.nextInt();
		double c=(a*b)/2;
		System.out.println("Area of trangle ->"+c);
		
	}
}