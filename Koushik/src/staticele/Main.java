package staticele;

public class Main {
public static void main(String[] args) {
	Staticele ele = new Staticele();//for static ele object creation is not required because 
	//the word static means that in memory the mem is created only once and we can access the ele directly 
	//without any object creation and the value gets updated and it override the value of the static ele
	System.out.println("ele var :"+Staticele.getEle());
	Staticele.setEle(40);
	System.out.println("ele var2:"+Staticele.getEle());
	Staticele.setEle(50);
	System.out.println("ele var3:"+Staticele.getEle());
	//once see the staticele class

	
}
}
