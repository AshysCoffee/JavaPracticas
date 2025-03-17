package ejercicioCircuito;

public class Circuitos {

	//Establecemos los atributos pedidos de la clase
	private double intensidad, voltaje, resistencias;
	
	//CONSTRUCTOR
	public Circuitos(double voltaje) {
		this.voltaje = voltaje;
	}


	//GET/SET-TERS
	public double getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(double voltaje) {
		this.voltaje = voltaje;
	}

	
	public double getResistencias() {
		return resistencias;
	}

	public void setResistencias(double resistencias) {
		this.resistencias = resistencias;
	}
	
	
	public double getIntensidad() {
		return intensidad;
	}

	public void setIntensidad(double intensidad) {
		this.intensidad = intensidad;
	}


	//METODOS
	public void AñadirResistencia (double resistencia) {
		this.resistencias+=resistencia;
	}	//Este método va sumando las resistencias insertadas para luego calcular la intensidad en un circuito.
	
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
