package Loops;
import java.util.Scanner;
public class Reverseofnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.print("Reverse of the number:");
      while(n>0){
            int s = n%10;
            System.out.print(s);
            n=n/10;
        }

	}

}
