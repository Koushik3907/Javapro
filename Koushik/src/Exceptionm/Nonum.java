package Exceptionm;
import java.util.*;
public class Nonum {
	int x;
public static void main(String[] args) {
	Nonum n = new Nonum();
	try {
		n.lisence();
	} catch (UnderAgeException e) {
	e.printStackTrace();
	}
}
class UnderAgeException extends Exception{
	
}
public void lisence() throws UnderAgeException {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Age:");
	x=sc.nextInt();
	if(x<18) {
		System.out.println("Not Eligible : Under Age");
		throw new UnderAgeException();
		
	} else {
System.out.println("Eligible For Applying Lisence");
System.out.println("Enter the Details:");
System.out.println("Enter Name:");
String name = sc.next();
System.out.println("Enter Aadhar Num");
int num = sc.nextInt();
System.out.println("Application Sent Successfully \nCheck The Details");
System.out.println("Name of Applicant:"+name+"\nAadhar Num:"+num+"\nAge"+x);

	}
}
}
