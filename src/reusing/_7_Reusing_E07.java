package reusing;

class A{

	A(int i){
		
		System.out.println("Constructor A(): " + i);
	}
}

class B extends A{
	
	B(int i){
		super(11);
		System.out.println("Constructor B(): " + i);
	}
	
}



public class _7_Reusing_E07 extends B{

	//super(22);
	_7_Reusing_E07(){
		super(22);
		System.out.println("Constructor \"7_Reusing_E07\".");
	}
			
	public static void main(String[] args) {
		
		new _7_Reusing_E07();
		
	}

}
