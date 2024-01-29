package if_else;
import java.util.Scanner;
public class If_else2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int x =sc.nextInt();
    int y =sc.nextInt();
    if(n>x&&n>y){
        System.out.println(n);
    }
    else if(x>n&&x>y){
        System.out.println(x);
    }
    else{
        System.out.println(y);
    }
}
}
