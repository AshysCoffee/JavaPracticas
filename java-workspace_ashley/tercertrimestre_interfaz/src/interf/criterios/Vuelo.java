package interf.criterios;

import java.time.LocalTime;

public class Vuelo {
	
	private String numero_vuelo, origen, destino;
	private LocalTime salida;
	private int duracion;
	
	
	public Vuelo(String numero_vuelo, String origen, String destino, LocalTime salida, int duracion) {
		super();
		this.numero_vuelo = numero_vuelo;
		this.origen = origen;
		this.destino = destino;
		this.salida = salida;
		this.duracion = duracion;
	}
	
	
	public String getNumero_vuelo() {
		return numero_vuelo;
	}
	public void setNumero_vuelo(String numero_vuelo) {
		this.numero_vuelo = numero_vuelo;
	}
	
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public LocalTime getSalida() {
		return salida;
	}
	public void setSalida(LocalTime salida) {
		this.salida = salida;
	}
	
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String toString () {
		String s = "";
		s+= "Número de vuelo: " +numero_vuelo+"\n";
		s+= "Ciudad de origen: " +origen+"\n";
		s+= "Ciudad de destino: " +destino+"\n";
		s+= "Hora de salida: " +salida+"\n";
		s+= "Duración de vuelo: " +duracion+"\n";
		return s;
	}

	

}
 

/*
 * Se tiene una colección de objetos de tipo Vuelo almacenados en una LinkedList<Vuelo>. 
 * Cada objeto Vuelo contiene la siguiente información: número de vuelo (String numero), 
 * ciudad de origen (String origen), ciudad de destino (String destino), hora de salida (LocalTime salida) y duración del vuelo en minutos (int duracion).

Se desea implementar una funcionalidad que permita ordenar la LinkedList según diferentes criterios de ordenación,
que el usuario podrá elegir en tiempo de ejecución. Los criterios posibles son:

Por número de vuelo (orden alfabético ascendente).
Por ciudad de origen (orden alfabético ascendente).
Por ciudad de destino (orden alfabético ascendente).
Por hora de salida (de más temprano a más tarde).
Por duración del vuelo (de menor a mayor).

Implementa esta funcionalidad utilizando comparadores personalizados (Comparator<Vuelo>) 
y aplica la ordenación a la LinkedList<Vuelo> utilizando las herramientas estándar de Java (por ejemplo, Collections.sort).*/
