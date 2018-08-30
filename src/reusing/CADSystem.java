package reusing;




class Shape{
	
	Shape(int i) {		
		System.out.println("Shape Constructor.");
	}
	
	void dispose() {		
		System.out.println("Shape dispose.");
	}
}

class Circle extends Shape{	
	Circle(int i) {		
		super(i); 
		System.out.println("Circle Constructor.");
	}	
	void dispose() {		
		System.out.println("Circle dispose.");
		super.dispose();
	}
}

class Triangle extends Shape{	
	Triangle(int i) {		
		super(i);
		System.out.println("Triangle Constructor.");
	}	
	void dispose() {		
		System.out.println("Triangle dispose.");
		super.dispose();
	}
}

class Line extends Shape{
	
	private int start,finish;
	Line(int i, int j){
		super(i);
		this.start=i;
		this.finish=j;
		System.out.println("Line Constructor:" + " Start: " + this.start + " finish: " + this.finish + "n");
		System.out.println("Combined constructor.");
	}
	void dispose() {		
		System.out.println("Triangle dispose.");
		super.dispose();
	}
}

public class CADSystem extends Shape{

	private Triangle t;
	private Circle c;
	private Line [] lines = new Line[3];
	
	public CADSystem(int i) {		
		super(i);		
		for (int j=0; j<lines.length; j++) {			
			lines[j] = new Line(j, j*j);
		}
		t = new Triangle (i);
		c = new Circle (i);		
	}
	public void dispose() {		
		c.dispose();
		t.dispose();
		for(int j=lines.length; j>=0; j--) {			
			lines[j].dispose();
		}		
		super.dispose();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
