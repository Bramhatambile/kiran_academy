package demo;

import java.util.Scanner;

public class capital {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter name of state");
	String state=s1.nextLine();
	switch(state) {
	case "Maharastra": System.out.println("mumbai");
		break;
	case "Gujarat":System.out.println("Gandhinagar");
	break;
	case "Hariyana": case"Panjab":System.out.println("Chandigarh");
	break;
	
	case "Telangana":System.out.println("Hyderabad");
	break;
	
	case "Kerala":System.out.println("Thiruvananthapuram");
	break;
	
	case "Rajsthan":System.out.println("Jaipur");
	break;
	
	case "Sikkim":System.out.println("Gangtok");
	break;
	
	case "Goa":System.out.println("Panaji");
	break;
	
	case "Madhya Pradesh":System.out.println("Bhopal");
	break;
	
	case "Andhra Pradesh":System.out.println("Amaravati");
	break;
	
	case "Assam":System.out.println(" Dispur");
	break;
	
	
	}
}
}
