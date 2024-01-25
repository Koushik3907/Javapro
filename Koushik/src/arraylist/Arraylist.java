package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		System.out.println("Enter the size");
		int n=sc.nextInt();
		System.out.println("enter into array list");
		for(int i=0;i<n;i++) {
			names.add(sc.next());
		}
		System.out.println("Iteration of list");
		for(int i=0;i<n;i++) {
			System.out.println(names.get(i));
		}
		
	}
}
