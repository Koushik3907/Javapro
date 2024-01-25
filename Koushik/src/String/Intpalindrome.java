package String;

public class Intpalindrome {
public static void main(String[] args) {
	int p =121;
	int z =p;
	int sum = 0, r =0;
	while(p>0) {
		r=(p%10);
		sum=r+sum*10;
		p=p/10;
	}
	System.out.println(sum);
	if (z==sum) {
		System.out.println("Given Num is a palindrome");
		
	}
	else {
		System.out.println("Given num is not  a palindrome");
	}
}
}
