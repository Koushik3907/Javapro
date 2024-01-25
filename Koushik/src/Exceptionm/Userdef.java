package Exceptionm;
import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;
public class Userdef {
public static void main(String[] args) {
	Userdef ud  =new Userdef();
	try {
		ud.negativenum();
	} catch (NegativeException e) {
		e.printStackTrace();
	}
}
class NegativeException extends Exception{
//we can't use print statements over here
	
}
public void negativenum() throws NegativeException{
	Scanner sc = new Scanner(System.in);
	int x=sc.nextInt();
	if (x<0) {
		throw new NegativeException();
	}
	else {
		System.out.println("Not an negative num");
	}
}
}
