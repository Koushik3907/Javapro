package String;

public class Demo1 {
public static void main(String[] args) {
	String s1 = new String("Hello");//by creating like this new memory gets created
	String s2 = new String("hello");
	String m = "Koushik";
	String k = "Koushik";
	if (s1==s2) {
		System.out.println(s1==s2);
	}
	else if (s1.equalsIgnoreCase(s2)) {
		System.out.println("Different memory locations but by using equals method the output will be given correct");
	}
	if (m==k) {
		System.out.println("Hello");
	}
}
}
