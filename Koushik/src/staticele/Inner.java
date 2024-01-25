package staticele;

public class Inner {
     
	Nonstatic c = new Nonstatic();
	public static class Pop{
		public static void name() {
			System.out.println("Static inner class");
		}
	}
	public class Nonstatic{
		public void bholo() {
			System.out.println("Non static inner class");
		}
	}
	
}
