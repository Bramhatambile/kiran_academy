package control;

import java.util.Scanner;

public class checkprime {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);

	System.out.println("ENTER number");
	int i=1 ;
	int		count=0;
	int y=sc.nextInt();
	while(i<=y){
		if(y%i==0) {
			count++;
		
		}
	
		i++;
	}
		if(count==2) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime");
		}
	}

}
