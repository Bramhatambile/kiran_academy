package pattern;

import java.util.Scanner;

public class Rounddown {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter number ");
	int n=sc.nextInt();
	if(n%5!=0) {
		int number=(n/5)*5;
		System.out.println("->"+number);
	}else {
		System.out.println("->"+n);
	}
}
}
