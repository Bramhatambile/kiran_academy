package demo;

import java.util.Scanner;

public class hightsN {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		int a=sc.nextInt();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter b");
		int b=sc.nextInt();
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter c");
		int c= sc.nextInt();
		if(a>b && a>c) {
			System.out.println("a is highest");
		}
		else  if(b>a && b>c){
			System.out.println("b is highest");
		}
		else {
			System.out.println("c is highest");
		}
}
}
