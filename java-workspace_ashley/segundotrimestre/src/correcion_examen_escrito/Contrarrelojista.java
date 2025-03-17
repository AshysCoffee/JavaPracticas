package correcion_examen_escrito;

public class Contrarrelojista extends Ciclista{
	
	//ATRIBUTOS
	private double veloc_max;
	
	//CONSTRUCTOR
	public Contrarrelojista(String nombre) {
		super(nombre);
	}

	//GETTERS Y SETTERS
	public double getVeloc_max() {
		return veloc_max;
	}
	public void setVeloc_max(double veloc_max) {
		this.veloc_max = veloc_max;
	}

	//METODOS
	public String visualizaCiclista() { 	//Llamamos al método padre con super. y le añadimos el tipo, para que de un string.
		return super.visualizaCiclista()+" Contrarrelojista\n";
	}
	
	//TO STRING
	public String toString() {
		return super.toString()+"Velocidad máxima: "+veloc_max+" Km/h\n";
	}

}
