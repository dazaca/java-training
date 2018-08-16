package access.connection;

public class ConnectionManager {

	private static Connection[] pool = new Connection[10]; //Declaración matriz
	private static int counter=0;
	
	static { // Inicialización de la matriz
		
		for (int i=0; i<pool.length; i++)
		{
			pool[i]=new Connection(); 
		}
	}
	
	// Devolvemos uno a uno los objetos de la matriz de objetos pool[] basándonos en elp autoincrementador "counter".
	public static Connection getConnection() { 
		
		if (counter < pool.length)
		{
			return pool[counter++];
		}
		return null;
	}
	
}
