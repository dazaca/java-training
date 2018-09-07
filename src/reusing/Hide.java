package reusing;



class Homer{
	
	char doh(char c) {
		
		System.out.println("doh(char)");
		return 'd';
	}

	float doh(float f) {
		
		System.out.println("doh(float)");
		return 0.1f;
	}
	
}


class Milhouse{}

class Bart extends Homer{
	
	void doh(Milhouse m) {
		
		System.out.println("doh(Milhouse)");
		
	}
	
}

class Lisa extends Homer{
	
	//@Override void doh(Milhouse m) {
	void doh(Milhouse m) {
		
		System.out.println("doh(Milhouse)");

	}
	
}

public class Hide {

	
	public static void main(String[] args) {
		
	Lisa l = new Lisa();
	Bart b = new Bart();
	l.doh('d');
	b.doh(1);
	b.doh('x');
	b.doh(1.0f);
	b.doh(new Milhouse());
	}

}
