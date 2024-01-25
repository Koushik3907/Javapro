package Exceptionm;

public class Main {

	public static void main(String[] args) {
		int y=0, x;
		try {
			System.out.println("Before Execution");
			System.out.println(y);
		x=(10*10)/0;
			System.out.println("Divide the num"+y);
			int a=10;
			x=(y=10*10)/0;
			System.out.println(a);
			System.out.println("After Execution");
		} catch (Exception e) {
			System.out.println("There will be a Arthmetic Excption");
			System.out.println(e);
			e.printStackTrace();
		} finally {
			System.out.println(y);
		}
	}

}
