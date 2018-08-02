import java.util.Random;

public class _4_ControlFlow_Foreach {

	public static void main (String[] args) {
		
		Random r = new Random(47);
		float m[] = new float [10];
		for(int i=0;  i<10; i++)
		{
			m[i]=r.nextFloat();
		}
		
		for(float f : m)
			System.out.print(f + " / "+ "\n\n");
		for(char c : "Divide chain".toCharArray())
			System.out.print(c + " " + "\n\n");
		
	}

}
