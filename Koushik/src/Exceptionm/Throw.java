package Exceptionm;
public class Throw {
public static void main(String[] args) {
	Throw t = new Throw();
	try {
		t.write();
	}finally {
		System.out.println("Second Way");
	}
}
public void write() throws RuntimeException{
		String g = "Koushik";
		if (g.equals("Koushik")) {
			throw new RuntimeException();
		}
}
}
