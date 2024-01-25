package Exceptionm;

import java.util.Scanner;


public class Balance {
	int balance=10000;
	int with;
	int sum=10000;
	String pass;
	String pass1;
	static int emoji  =0x1F600;
public static void main(String[] args) {
	Balance b = new Balance();
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<=100;i++) {
	System.out.println("1.Register\n2.Login\n3.Balance");

	int option=sc.nextInt();
	switch(option) {
	case 1:
		System.out.println("Registration");
		System.out.println("Create the password");
		b.pass=sc.next();
		System.out.println("Password has been set");
		break;
	case 2:
		System.out.println("For Login Enter the password");
		 b.pass1=sc.next();
		if (b.pass!=null && b.pass.equals(b.pass1)) {
			System.out.println("Login Sucessfulfull");
			System.out.println("1.Deposit\n2.Withdrawal");
			int op=sc.nextInt();
			switch(op) {
			case 1:
				System.out.println("Enter the Amount to be withdrawn");
				int depo=sc.nextInt();
			    b.sum=b.balance+depo;
				System.out.println("deposit Successfull"+b.sum);
				
				break;
			case 2:
				try {
					b.withdrawal();
				} catch (LimitExceedException e) {
			            e.printStackTrace();
				}
				}
				if (b.pass==null || !b.pass.equals(b.pass1)) {
					System.out.println("Entered Wrong Password or Password has not Genrated \nplease try again later\n"+Character.toString(emoji));
					
				}
				 break;
		
			}
			break;
	case 3:
		System.out.println("Enter the password");
		b.pass1=sc.next();
		if (b.pass!=null && b.pass.equals(b.pass1)) {
		System.out.println("Balance in account"+b.sum);
		}
		if (b.pass==null || !b.pass.equals(b.pass1)) {
			System.out.println("Entered Wrong Password or Password has not Genrated \nplease try again later\n");
			
		}
		break;
			}
			
			
		
		
	}
	

	
}
class LimitExceedException extends Exception{

}


public void withdrawal() throws LimitExceedException{
	Scanner sc = new Scanner(System.in);
	System.out.println("Balance Remaing in bank Account:"+sum);
	System.out.println("Enter the amount to be WithDrawn:");
	with = sc.nextInt();
	if (with>balance) {
		System.out.println("Limit Exceed");
		throw new LimitExceedException();
		
	} else {
     System.out.println("Withdrawn Successfull");
     System.out.println("Balance Amount:"+(sum-with));
	}
}
}
