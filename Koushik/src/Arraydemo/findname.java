package Arraydemo;
import java.util.*;
public class findname {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the number of names");
		int m =sc.nextInt();
		String[] name = new String[m];
		int i;
		for(i=0;i<m;i++) {
			name[i]=sc.next();
		}
		boolean r = false;
		for(i=0;i<m-1;i++) {
			for(int j=i+1;j<m;j++) {
			if(name[i].equals(name[j])) {
				r=true;
				System.out.println("names are equal i.e "+name[i]);
			}
		}
				}
		if(r!=true){
			System.out.println("not equal");
			
		
			}
		}
}
	
