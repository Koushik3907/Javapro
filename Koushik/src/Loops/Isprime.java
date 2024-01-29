package Loops;
import java.util.Scanner;
public class Isprime {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     int n =sc.nextInt();
     int co=0;
     for(int i=1;i<=n;i++){
         if(n%i==0){
             co=co+1;
         }
     }
 if(co==2){
     System.out.println("Prime");
 }
 else{
     System.out.println("Not Prime");
 }
}
}
