package Stacks;
import java.util.*;
public class Stacks {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Stack<Integer> num = new Stack<>();
	for(int i =0;i<=100;i++) {
	System.out.println("Enter the option\n1.Insert\n2.Delete\n3.Topelement\n4.Check\n5.Display Stack\n6.Exit");
	int op = sc.nextInt();
	switch(op) {
	case 1:
		System.out.println("Enter the number");
        int y =sc.nextInt();
		num.push(y);
		break;
	case 2:
		num.pop();
		break;
	case 3:
		if(num.isEmpty()==true) {
			System.out.println("stack is empty\n");
		}
		else {
			System.out.println(num.peek());
		}	
	case 4:
		System.out.println(num.isEmpty());
		break;
	case 5:
		System.out.println(num);
		break;
	case 6:
		System.exit (0);
	default:
		System.out.println("Invalid Entry");
	}
	}
}
}
