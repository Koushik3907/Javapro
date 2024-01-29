package Patterns;

import java.util.Scanner;

public class SpaceofRight {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     int n =sc.nextInt();
     int cou=1;
     for (int i =1; i<=n;i++){
         for(int j=0;j<i;j++){
             System.out.print(cou+"\t");
             cou++;
         }
        System.out.println();
     }
}
}
