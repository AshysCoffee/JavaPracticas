package poo.atleta;

public class Atleta {

	private int id;
	private String nombre_atleta;
	private double tiempo;
	private static int contador_atleta=0;
	private static int id_atleta=100;
	private static String pais="Colombia";
	private static double tiempoEquipo=0;
	
	public Atleta(String nombre_atleta, double tiempo) {
		super();
		this.nombre_atleta = nombre_atleta;
		this.tiempo = tiempo;
		this.id=id_atleta++; //debe haber un atributo normal para guardar el valor del static y asi no cambie
		NuevoAtleta();
	}
	
	static void NuevoAtleta() {
		contador_atleta++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre_atleta() {
		return nombre_atleta;
	}

	public void setNombre_atleta(String nombre_atleta) {
		this.nombre_atleta = nombre_atleta;
	}

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}
	
	public void Correr400Metros() {
		tiempoEquipo+=this.tiempo;
	}
	
	static String Equipo() {
		return pais;
	}
	
	static double TiempoTotal() {
		return tiempoEquipo;
	}
	
	public String toString() {
		String s="";
		s+=("----Atleta "+id+"----\n");
		s+=("Nombre completo: "+nombre_atleta+"\n");
		s+=("Tiempo de la prueba: "+tiempo+"\n");
		s+=("País: "+pais+"\n");
		s+=("Números de atletas que integran el equipo: "+contador_atleta+"\n");
		s+=("El tiempo total del equipo es "+tiempoEquipo+"\n");
		return s;
	}
	
}

/*Realizar un programa en Java que permita modelar un atleta, el cual t ene los siguientes atributos de instancia:
> Identificador del atleta de tipo int. 
> Nombre del atleta de tipo String.
> Tiempo en realizar una prueba de 400 metros por relevos, de tipo double.

Además, se tienen los siguientes atributos estáticos:
> Un contador con la cantidad de atletas creados, el cual servirá como identificador de un atleta.
> Un atributo estático denominado selección de tipo String con el valor “Colombia”.
> Un atributo estático denominado tiempoEquipo que sume los valores de tiempo obtenidos por un equipo de atletas.

Es necesario crear un constructor para la clase con los parámetros: nombre y tiempo de cada atleta. En el constructor se debe iniciallzar el identificador del atleta con base en el contador estático.
También se deben implementar los siguientes métodos:
Correr 400 metros: este método actualiza el tiempo total de carrera del equipo sumando el tiempo de carrera de cada atleta.
» Un método estático que imprima el nombre de la selección de atletismo, el cual es un atributo estático.
Un método estático que imprima el tiempo total obtenido por el equipo de atletismo.
Un método main que debe crear cuatro atletas que conforman el equipo de relevos de 400 metros, con los valores de la tabla 3.1.*/