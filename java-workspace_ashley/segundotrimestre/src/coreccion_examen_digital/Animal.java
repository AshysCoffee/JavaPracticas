//@author: Ashley Leon Espinoza
//Fecha: 25/02/2025

package coreccion_examen_digital;

public class Animal {
	
	//Creamos los dos atributos comunes entre todas las clases
	private String nombre;
	private int edad;
	private Cartilla cartilla;
	
	//Este atributo estatico nos servira como contador de animales
	private static int totalAnimales=0;

	
	//CONSTRUCTOR
	public Animal(String nombre, int edad, String fecha, int anno_nacimiento, String nombre_vet) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.cartilla= new Cartilla(fecha, anno_nacimiento, nombre_vet);
		totalAnimales++;
		
	}
	
	//GETTERS - Para obtener la información del atributo
	//SETTERS - Para cambiar los atributos mediante parametros externos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	
	//En este set se pone la condición de que la edad no puede ser menor a 0 
	public void setEdad(int edad) {
		if (edad>0) {
		this.edad = edad;
		}else{
		this.edad = 0;
		}
	}
	
	
	public Cartilla getCartilla() {
		return cartilla;
	}

	//Nos devolvera el total del contador
	public static int getTotalAnimales(){
		return totalAnimales;
	}
	

	//METODOS comunes que tendran las clases hijas, vacios para poder ser definidos en cada clase de forma que no haya conflictos
	public String hacerSonido() {
		return "";
	}
	
	public String comer() {
		return "";
	}
	
	public String moverse() {
		return "";
	}
	
	
	public void enfermar(int enfermedad) { //Implica poner por un parametro externo la cantidad de enfermedades tiene el animal
		this.cartilla.setNumEnfermedad(enfermedad);
	}	
	
	public void vacunar(int vacuna) {	//Implica poner por un parametro externo la cantidad de vacunas tiene el animal
		this.cartilla.setNumVacuna(vacuna);
	}	


	
	//TO STRING
	public String toString() {
		String s="";
		s+=("Nombre: "+nombre+"\n");
		s+=("Edad: "+edad+"\n");
		s+=("Fecha: "+cartilla.getFecha()+"\n");
		s+=("Año de nacimiento: "+cartilla.getAnno_nacimiento()+"\n");
		s+=("Veterinario: "+cartilla.getNombre_vet()+"\n");
		return s;
	}

}
