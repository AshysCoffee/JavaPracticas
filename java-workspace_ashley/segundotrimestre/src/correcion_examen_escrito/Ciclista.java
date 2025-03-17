package correcion_examen_escrito;

public class Ciclista {

	//ATRIBUTOS
	private static int idCiclista=101;
	private String nombre;
	private float tiempoCarrera=0;
	private int id;
	
	
	//CONSTRUCTOR
	public Ciclista(String nombre) {
		this.nombre = nombre;
		this.id = idCiclista++;
	}
	
	
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	
	
	public float getTiempoCarrera() {
		return tiempoCarrera;
	}


	public void setTiempoCarrera(float tiempoCarrera) {
		this.tiempoCarrera = tiempoCarrera;
	}


	public void setId(int id) {
		this.id = id;
	}

	
	//METODOS
	public String visualizaCiclista() { //Creamos el método en la clase padre para que las clases hijas puedan heredarlo.
		return "Soy ciclista:";
	}	

	//TO STRING
	public String toString() {
		String s="";
		s+=("Ciclista: "+nombre+"\n");
		s+=("ID: "+id+"\n");
		s+=("Tiempo: "+tiempoCarrera+"\n");
		return s;
	}
	
	
	
}
