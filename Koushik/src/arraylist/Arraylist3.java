package arraylist;
public class Arraylist3 {
	public static void main(String[] args) {
	Integer num1= 1000;
	Integer num2= 1000;
	Integer num3=128;
	Integer num4=128;
	if(num1==num2) {
		System.out.println("num1 == num2");
	}
	else {
		System.out.println("num1 != num2");
	}
	if(num3==num4) {
		System.out.println("num3==num4");
	}
	else {
		System.out.println("num3 !=num4");
	}
	
//You initialize num1 and num2 with the value 200. While 200 is within the cached range for Integer objects, 
	//Java doesn't guarantee reusing the same object for larger values. 
	//Therefore, num1 == num2 evaluates to false because they might be referencing different Integer objects.
	
	//the range of the catched Integer value is from -127 to 128 . even the input is 128 it will give different 
	int b = 10;
	Integer num5 = b;
	System.out.println(num5);//auto boxing
	int c = num2;
	System.out.println(c);//unboxing
	}
}
