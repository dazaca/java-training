package reusing;
import reusing_2.E15_ProtectedTest;




class InheritProtected extends E15_ProtectedTest{
	
	// private void callProtected(){super.protectedMethod();} --> won't be able to use at main
	public void callProtected(){super.protectedMethod();}
	
}

public class E15_ProtectedTest_call {

	public static void main(String[] args) {

		// E15_ProtectedTest pt = new E15_ProtectedTest();
		// pt.protectedMethod(); --> código no válido porque el método es PROTECTED
		
		InheritProtected ip = new InheritProtected();
		ip.callProtected();
	}

}
