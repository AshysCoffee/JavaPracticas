//Autor: Ashley Leon Espinoza
//Fecha: 25/02/2025


package prueba_arraylist;

public class Gato extends Animal {

	//ATRIBUTOS
	private String color_pelo, pais_origen;
	private int enfermedades=0;
	private int vacunas=0;

	//CONSTRUCTOR
	public Gato(String nombre, int edad, String fecha, int anno_nacimiento,  int numVacuna,
			int numEnfermedad,String nombre_vet, String color_pelo, String pais_origen) {
		
		super(nombre, edad, fecha, anno_nacimiento, nombre_vet);
		this.color_pelo = color_pelo;
		this.pais_origen = pais_origen;
	}

	
	//GETTERS - Para obtener la información del atributo
	//SETTERS - Para cambiar los atributos mediante parametros externos
	public String getColor_pelo() {
		return color_pelo;
	}

	public void setColor_pelo(String color_pelo) {
		this.color_pelo = color_pelo;
	}

	public String getPais_origen() {
		return pais_origen;
	}

	public void setPais_origen(String pais_origen) {
		this.pais_origen = pais_origen;
	}
	
	
	public int getEnfermedades() {
		return enfermedades;
	}

	public void setEnfermedades(int enfermedades) {
		this.enfermedades = enfermedades;
	}

	public int getVacunas() {
		return vacunas;
	}

	public void setVacunas(int vacunas) {
		this.vacunas = vacunas;
	}

	//SOBREESCRIBIMOS LOS METODOS DE LA SUPERCLASE ANIMAL
	//METODOS
	public String hacerSonido() {	//Es un método que devuelve un string que aporta informacion del animal
		return "Maúlla y dice miau, miau";
	}
	
	public String comer() {	//Es un método que devuelve un string que aporta informacion del animal
		return "Come pescado";
	}
	
	public String moverse() {	//Es un método que devuelve un string que aporta informacion del animal
		return "Salta de un mueble a otro";
	}
	
	public void enfermar(int enfermedad) {	//Implica poner por un parametro externo la cantidad de enfermedades tiene el animal
		super.enfermar(enfermedad);
	}	
	
	public void vacunar(int vacuna) {	//Implica poner por un parametro externo la cantidad de vacuna tiene el animal
		super.vacunar(vacuna);
	}

	
	//TO STRING
	public String toString () {
		String s="";
		s+=(super.toString());
		s+=("Color de pelaje: "+color_pelo+"\n");
		s+=("País de origen: "+pais_origen+"\n");
		s+=("Vacunas: "+getVacunas()+"\n");
		s+=("Enfermedades: "+getEnfermedades()+"\n");
		s+=("-------------------");
		return s;
	}
	
	
	
}
