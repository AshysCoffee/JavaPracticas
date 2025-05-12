package interf.circuitos;

import java.util.ArrayList;

public class Circuitos{

	//Establecemos los atributos pedidos de la clase
	private double intensidad, voltaje, total_resistencias;
	protected ArrayList <Resistencias> Resistencias;
	
	//CONSTRUCTOR
	public Circuitos(double voltaje) {
		this.voltaje = voltaje;
		this.Resistencias = new ArrayList <Resistencias>(); // en este caso, ponemos el this. (nombre-array) = new ArrayList <tipo/objeto>
	}


	//GET/SET-TERS
	public double getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(double voltaje) {
		this.voltaje = voltaje;
	}

	
	public double getTotal_resistencias() {
		return total_resistencias;
	}

	public void Total_resistencias(double total_resistencias) {
		this.total_resistencias = total_resistencias;
	}
	
	
	public double getIntensidad() {
		return intensidad;
	}

	public void setIntensidad(double intensidad) {
		this.intensidad = intensidad;
	}


	//METODOS
	public void AddResistencia (Resistencias r) {
		Resistencias.add(r);	
		this.total_resistencias+=r.getResistencia();
		
	}	//Este método va sumando las resistencias insertadas para luego calcular la intensidad en un circuito y añade el objeto al arraylist.
	
	public void DeleteResistencia (Resistencias r) {
		Resistencias.remove(r);	
		this.total_resistencias-=r.getResistencia();
		
	}	//Este método va sumando las resistencias insertadas para luego calcular la intensidad en un circuito y añade el objeto al arraylist.
	
	public double SumaTotalResis() {
		return this.total_resistencias;
	}
	
	public double CalcularIntensidad() {
		return 0;
	} //el método vacio en la clase padre para luego ser heredado por las clases hijas
	
	public double Intensidad_Total() {
		return 0;
	} //el método vacio en la clase padre para luego ser heredado por las clases hijas
	
	
	//TO STRING
	public String toString () {
		return "Voltaje: "+voltaje+"  V\n";
	}

}
