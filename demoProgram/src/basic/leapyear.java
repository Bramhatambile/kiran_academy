package demo;

import java.util.Scanner;

public class leapyear {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter year");
	int year=sc.nextInt();
	if ((year%4==0 && year/100!=0) || (year%400==0)){
		System.out.println("This is  leap year");
	}
	else {
		System.out.println("year is not leap year");
	}
}
}
