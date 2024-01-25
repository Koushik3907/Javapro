package Arraydemo;
import java.util.*;
public class evenodd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("Enter the no of numbers present in the list");
	int num[] = new int[n]; 
	for(int i =0;i<n;i++) {
		num[i]=sc.nextInt();
	}
	System.out.println("Even Numbers");
	for(int i=0;i<n;i++) {
		if(num[i]%2==0) {
			System.out.print(" "+num[i]);
		}
	}
	System.out.println("\nOdd Numbers");
	for(int i=0;i<n;i++) {
		if (num[i]%2!=0) {
			
		
			System.out.print(num[i]);
		}
	}
}
}
