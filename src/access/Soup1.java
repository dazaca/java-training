package access;

class Soup1 {

	private Soup1() {
		
		System.out.println("Inside private constructor class Soup1.");
	}
	// (1) Allow creation via static method:
	public static Soup1 makeSoup() {
		
		return new Soup1();
		
	}
}
