
package staticele;
import java.util.*;
public class Maininner {

	public static void main(String[] args) {
		//Inner.Pop.name; here we cannot access the method called name because 
		//in that inner class that method is not static 
		Inner.Pop.name();
		Inner op = new Inner();
		op.c.bholo();
		Scanner scanner =new Scanner(System.in);
		scanner.nextInt();
		// for implementing the non static inner class we need to create the object for 
		//the inner class in the main class once have a look on inner.java class
	}
   
}
//*******************Final Keyword***************************
//if we use final keyword for an variable and create an object and tried to access then
//the object value cannot be resigned or manipulated 
//if we want to resign the we need to create a new object and access the var
//and if we used final keyword the we can't we the setter for that variable
//if the final var is not intialize then we can use constructors
//if the value is intialize the we can't make use of constructors
//rather we can use default constructor but we can't modify the final var
// if we mark a method with final keyword the it can't be override
//if we mark a class with final keyword then the class can not be inherited
//*************************************************************