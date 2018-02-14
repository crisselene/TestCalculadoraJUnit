package uf2;

public class Refactorizar {

	private static final double GRAVEDAD = 9.8;
	private String nombre; 
	//EJEMPLO 1
	
	/*private void imprimirAlumno (Empleado chachi) {
		//Alumno es la clase y alumno es el atributo objeto
		
		System.out.println(chachi.toString()); 
		//aqu� se cambia tambien chachi si lo seleccionas y le das a refactor en el chachi de imprimirAlumno
		
		Empleado empleado= new Empleado("56462556C", "JohnDoe" );
	}
	*/
	
	//EJEMPLO 2
	
	//ANTES:
	
	/*String nombre;
	
	void imprimirTodo() {
		
		imprimirBanner();						
		//lo primero que hace este m�todo(imprimirTodo( es llamar a una funci�n (imprimirBanner)
		
		//detalles de impresi�n es lo segundo
		
		System.out.println("nombre: "+ nombre);
		System.out.println("cantidad: "+ getCargoPendiente());
		
		//la funci�n imprimirBanner hace 2 funciones, por lo que no es adecuado porque habr�a que poner 
		// funciones concretas que se ocuparan de una sola tarea
		
		//lo que queremos es sacar los sysos de este m�todo para extraerlo a otro
	}
	
	void imprimirBanner() {}
	float getCargoPendiente() {return 0;}
}
*/
	
	
	
	
	//DESPU�S
/* seleccionamos los sysos y le damos a extract method, y ya nos saca el metodo imprimirDetalles*/
	
	//lo que queremos es meter el new String en el syso
	
	public void setNombre () {
	System.out.println(new String ("Criis"));
	}
	// y ya lo tenemos
	
	private String logo = "Universidad Europea";
	private String patata = "Universidad Europea";
	
	double energiaPotencial (double masa, double altura) {
		return masa * altura * GRAVEDAD ;
	}
	void imprimirTodo() {
		
		System.out.println(logo); //ponemos aqu� "Universidad Europea". Despu�s damos a boton derecho
		//y damos a extract local variable
		
		
		System.out.println(patata);
		
		
		
		imprimirBanner();						
		//lo primero que hace este m�todo(imprimirTodo( es llamar a una funci�n (imprimirBanner)
		
		//detalles de impresi�n es lo segundo
		
		imprimirDetalles();
		
		//la funci�n imprimirBanner hace 2 funciones, por lo que no es adecuado porque habr�a que poner 
		// funciones concretas que se ocuparan de una sola tarea
		
		//lo que queremos es sacar los sysos de este m�todo para extraerlo a otro
	}

	private void imprimirDetalles() {
		System.out.println("nombre: "+ getNombre());
		System.out.println("cantidad: "+ getCargoPendiente());
	}
	
	void imprimirBanner() {}
	float getCargoPendiente() {return 0;}
	
	
	private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
*/
	
	
	
}