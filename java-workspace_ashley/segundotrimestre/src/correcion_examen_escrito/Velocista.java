package correcion_examen_escrito;

public class Velocista extends Ciclista{
	
	//ATRIBUTOS
	private double potencia_promedio,sprint;

	//CONSTRUCTOR
	public Velocista(String nombre) {
		super(nombre);
	}
	
	//GETTERS Y SETTERS
	public double getPotencia_promedio() {
		return potencia_promedio;
	}
	public void setPotencia_promedio(double potencia_promedio) {
		this.potencia_promedio = potencia_promedio;
	}
	

	public double getSprint() {
		return sprint;
	}
	public void setSprint(double sprint) {
		this.sprint = sprint;
	}

	//METODOS
	public String visualizaCiclista() {		//Llamamos al método padre con super. y le añadimos el tipo, para que de un string.
		return super.visualizaCiclista()+" Velocista\n";
	}

	//TO STRING
	public String toString() {
		return super.toString()+"Potencia media: "+potencia_promedio+" Vatios\nSprint: "+sprint+" Km/h\n";
	}
	
}
