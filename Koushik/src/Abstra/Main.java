package Abstra;

public class Main {
public static void main(String[] args) {
	Person p= new Tamil();
	//Polymorphism type like creating an instance in person class and it will extended
	//to Tamil class so we can access the methods this is case-1 i.e invoking derived class through base class
	p.eat();
	p.speak();
	Person p1 =new Person() {
		public void speak() {
			System.out.println("Speaks English");//anynomus class 
			//Person p; this is an anynomus object
		}
	};
	// this is the case-2 i.e when we want to invoke base class through base class 
	//then we need to override the method like the above one to achieve abstraction
	// ; is must after the declartion//anynomus class
}
}
