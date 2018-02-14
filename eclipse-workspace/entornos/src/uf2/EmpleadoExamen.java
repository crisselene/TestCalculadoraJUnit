package uf2;

public class EmpleadoExamen  {
	//he utilizado la t�cnica rename para cambiar el nombre
	//de la clase a EmpleadoExamen 
	
		private int codigo;
		private String nombre;
		private String oficio;
		private Double salario;
		private Departamento dept;
		
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
			
			
		}
		
		public void imprimirTodo(Object newParam) { 
			//he utilizado Change Method signature y 
			//he a�adido un par�metro newParam
			
			//he usado m�todo inline para meter el m�todo imprimirCabecera
			//que estaba contenido en este otro m�todo
			System.out.println("Empresa ITT");
			System.out.println("************");
			System.out.println("C�digo" + getCodigo());
			System.out.println("Nombre" + nombre);
			System.out.println("Oficio" + oficio);
		} 
		
		private void imprimirDatos() {
			System.out.println("Datos empleado");
			System.out.println("************");
			
			System.out.println("C�digo: " + getCodigo());
			System.out.println("Nombre: " + nombre);
			System.out.println("Oficio: " + oficio);
			 
		}
		
		//t�cnica encapsule field para sacar el get y set de slario
		private Double getSalario() {
			return salario;
		}
		private void setSalario(Double salario) {
			this.salario = salario;
		}

}
