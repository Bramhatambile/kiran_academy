package demo;

import java.util.Scanner;

public class areaofcicle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Radious");
	int r=sc.nextInt();
	double pi=3.14;
	 double A;
	  double area=pi*r*r;
	  System.out.println("Area of circle is->"+area);
}
}
