package access;

public class Lunch {

	void testPrivate() {
		
		// Soup1 soup = new Soup1(); // Can't do this! Private constructor defined for Soup1;
	}
	
	public static void main(String[] args) {

		
		Soup1.makeSoup();
		// Also possible (but "soup" must have to be used: 
		// Soup1 soup = Soup1.makeSoup();
		Soup2.access().f();
	}

}
