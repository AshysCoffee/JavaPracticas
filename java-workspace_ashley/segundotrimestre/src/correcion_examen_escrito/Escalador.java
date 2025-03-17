package correcion_examen_escrito;

public class Escalador extends Ciclista{

	//ATRIBUTOS
	private float acel_promedio, grados_rampa;
	
	//CONSTRUCTOR
	public Escalador(String nombre) {
		super(nombre);
	}

	//GETTERS Y SETTERS
	public float getAcel_promedio() {
		return acel_promedio;
	}

	public void setAcel_promedio(float acel_promedio) {
		this.acel_promedio = acel_promedio;
	}

	public float getGrados_rampa() {
		return grados_rampa;
	}

	public void setGrados_rampa(float grados_rampa) {
		this.grados_rampa = grados_rampa;
	}
	
	
	//METODOS
	public String visualizaCiclista() {		//Llamamos al método padre con super. y le añadimos el tipo, para que de un string.
		return super.visualizaCiclista()+" Escalador\n";
	}
	
	//TO STRING
	public String toString() {
		return super.toString()+"Acelaracion promedio de subida: "+acel_promedio+" m/s^2\nGrados de rampa soportada: "+grados_rampa+" grados\n";
	}
}
