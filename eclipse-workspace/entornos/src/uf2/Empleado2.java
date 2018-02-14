package uf2;

/*public class Empleado {
	private String dni;
	private String nombre;
	
	
	// Empleado(){ constructor por defecto es cuando no tiene nada dentro del par�ntesis, argumentos
	
	Empleado(String dni, String nombre){
		
	}
}*/




/**
 * <h2>Clase Empleado, se utiliza para crear y leer empleados de una BBDD</h2>
 * Busca informaci�n de javadoc en <a href="https://www.google.es/webhp?hl=es&sa=X&ved=0ahUKEwj-6MHyquPXAhXjK8AKHavcCzAQPAgD">
 * 
 * @author 21732599
 * @version 1.0
 * @since noviembre 2017
 *
 */

public class Empleado2 {
	/**
	 * Atributo Nombre del empleado
	 */
    private String nombre;
    /**
     * Atributo Apellido del empleado
     */
    private String apellido;
    /**
     * Atributo Salario del empleado
     */
    private double salario;
    
    /**
     * Constructor con 3 par�metros
     * Crea objetos de tipo empleado, con nombre, apellido y sueldo
     * 
     * @param nombre nombre del empleado
     * @param apellido apellido del empleado
     * @param salario sueldo bruto mensual
     */

    public Empleado2(String nombre, String apellido, double salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=salario;
    }
    /**
     * Sube el salario al empleado seg�n una cantidad
     * @see Empleado2
     * @param subida
     */
    
    //see sirve para hiperenlaces entre clases, aqu� por ejemplo es para mostrar los datos de empleado, de forma que cuando cliques sobre �l
    //te llevar� a donde est�n escritos los datos de empleado
 
    public void subirSalario (double subida){
           salario=salario + subida;
    }
    /**
     * Comprueba que el nombre no est� vac�o 
     * 
     * @return
     */
 
    private boolean comprobar(){
        if(nombre.equals("")){
            return false;
        }
        return true;
    }
   
}

