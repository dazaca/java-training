package reusing;

/*

Versión modificada de la clase coche:

-por composición, crearemos un vehículo de cuatro ruedas

	-1 motor-> encender/apagar
	-2 puertas (izq-der)-> abre/cierra
	-cada puerta -> una con ventanas-> sube/baja
	-4 ruedas 
	
-por herencia: la clase coche heredará de la case vehículo.

*/


class Engine{
	
	Engine() {System.out.println("Engine constructor.");}
	void start() {System.out.println("Engine start.");}
	void stop() {System.out.println("Engine stop.");}
}

class Window{
	
	Window(){System.out.println("Window constructor.");}
	void rollup () {System.out.println("Window rollup.");}
	void rolldown () {System.out.println("Window rolldown.");}
}

class Door{
	
	// Composición: una puerta TIENE UN cristal. El objeto Window se crea aquí y no
	// va ser evocado más que cuando se cree un objeto tipo Door. Al crear un objeto
	// tipo Door en Main() podremos acceder a los métodos de Windows "rollup/rolldown".
	
	Window window = new Window();
	
	Door(){System.out.println("Door constructor.");}
	void open () {System.out.println("Door open.");}
	void close () {System.out.println("Door close.");}
	
	
}

class Wheel{
	
	
	Wheel (int psi, int id){
		
		System.out.println("Wheel constructor.");
		System.out.println("Wheel number " + id +": Inflated @ " + psi + " psi.");
	}
	void inflate(int psi) {System.out.println("Inflating @ " + psi);}
}


// Herencia: un coche ES UN vehículo

class Car extends Vehicle{
	
	
	
	
	
	Car(){
		
		//super();
		
		// La inicialización de los 4 objetos ruedas puede aparecer
		// al principio del todo incluyéndola en el constructor.
		
//		for (int i=0; i<4; i++)
//		{
//			
//			wheel[i]= new Wheel(i);
//		}
		System.out.println("Car constructor.");
		
	
	}
	
}

public class Vehicle {
	
	// Código alternativo si sólo queremos crear un objeto Vehicle y
	// acceder por composición a sus clases asociadas:
	
	public Engine engine = new Engine();
	public Wheel wheel[] = new Wheel[4];
	public Door 
		leftdoor = new Door(),
		rightdoor = new Door();

	//	for (int i=0; i<4; i++) {
	//		
	//		wheel[i]= new Wheel(37,i);
	//	}
	
	public Vehicle () {
		
		System.out.println("Vehicle constructor.");
		
		for (int i=0; i<4; i++) {
			
			wheel[i]= new Wheel(37,i);
		}
	}
	

/*

Engine engine = new Engine();
	Door leftdoor = new Door();
	Door rightdoor = new Door();
	
	Wheel wheel[] = new Wheel[4];
	// Inicialización de los objetos ruedas
	for (int i=0; i<4; i++)
	{
			
	 wheel[i]= new Wheel(37, i);
	}
*/
	
	
	public static void main(String[] args) {
		
	//Vehicle v = new Vehicle();
	
	Car c = new Car();
	c.engine.start();
	c.engine.stop();
	c.leftdoor.open();
	c.leftdoor.window.rolldown();
	c.rightdoor.open();
	c.rightdoor.window.rolldown();
	c.leftdoor.close();
	c.rightdoor.close();
	
	}

}

