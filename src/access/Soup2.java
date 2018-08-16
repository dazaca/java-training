package access;

class Soup2 {
	
	private Soup2() {}
	
	private static Soup2 sp1 = new Soup2();
	// (2) Create a static object and return a reference
	// upon request.(The "Singleton" pattern):
	public static Soup2 access() {
		
		return sp1;
	} 

	public void f() {
		
		System.out.println("Fonction f() inside class Soup2.");
	}
	
}
