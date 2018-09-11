package reusing;

class counter{
	
	private static int count;
	private int i = count++;
	
	public String toString() {
		
		return "Autocontador = " + i;
	}
}

class conCamposFinal{
	
	final counter c1 = new counter();
	static final counter c2 = new counter();
	
	public String toString() {
		
		return "Counter c1 = " + c1 + "\nCounter c2 (final) = " + c2;
	}
		
}

public class E18_FinalFields {

	public static void main(String[] args) {
		
		System.out.println("First object:");
		System.out.println(new conCamposFinal());
		System.out.println("Second object:");
		System.out.println(new conCamposFinal());
		
	}

}
