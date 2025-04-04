//Autor: Ashley Leon Espinoza
//Fecha: 25/02/2025


package prueba.arraylist;

public class Perro extends Animal{
	
	//ATRIBUTOS
	private String raza, pedrigri;
	private int enfermedades=0;
	private int vacunas=0;

	//CONSTRUCTOR
	public Perro(String nombre, int edad, String fecha, int anno_nacimiento, String nombre_vet, String raza, String pedrigri) {
		super(nombre, edad, fecha, anno_nacimiento, nombre_vet);
		this.raza = raza;
		this.pedrigri = pedrigri;
	}

	//GETTERS - Para obtener la información del atributo
	//SETTERS - Para cambiar los atributos mediante parametros externos
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getPedrigri() {
		return pedrigri;
	}

	public void setPedrigri(String pedrigri) {
		this.pedrigri = pedrigri;
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
		return "Ladra y dice guau, guau";
	}
	
	public String comer() {	//Es un método que devuelve un string que aporta informacion del animal
		return "Come croquetas";
	}
	
	public String moverse() {	//Es un método que devuelve un string que aporta informacion del animal
		return "Corre felizmente";
	}
	
	public void enfermar(int enfermedad) {	//Implica poner por un parametro externo la cantidad de vacuna tiene el animal
		super.enfermar(enfermedad);
	}	
	
	public void vacunar(int vacuna) {	//Implica poner por un parametro externo la cantidad de vacuna tiene el animal
		super.vacunar(vacuna);
	}

	//TO STRING
	public String toString () {
		String s="";
		s+=(super.toString());
		s+=("Raza: "+raza+"\n");
		s+=("Pedrigri: "+pedrigri+"\n");
		s+=("Vacunas: "+getVacunas()+"\n");
		s+=("Enfermedades: "+getEnfermedades()+"\n");
		s+=("-------------------");
		return s;
	}

}
