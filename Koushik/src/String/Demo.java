package String;
import java.util.*;
public class Demo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String x = sc.next();
	String y = "";
	for (int i =(x.length()-1);i>=0;--i) {
		y=y+x.charAt(i);
	}
	System.out.println(y);
if (x.equalsIgnoreCase(y)) {
	System.out.println("it is a palindrome");
}
else {
	System.out.println("it is not a palindrome");
}
}
}
