package ejercicioCircuito;

public class EnSerie extends Circuitos{

	private double intensidad_Total;
	
	//CONSTRUCTOR
	public EnSerie(int voltaje) {
		super(voltaje);
	}
	
	//GET/SET-TERS
	public double getIntensidad_Total() {
		return intensidad_Total;
	}

	public void setIntensidad_Total(double intensidad_Total) {
		this.intensidad_Total = intensidad_Total;
	}

	//METODOS
	public void AñadirResistencia (double resistencia) {
		super.AñadirResistencia(resistencia);
	}		//Metodo heredado de la clase Circuitos
	
	public double CalcularIntensidad() {
		double intensidad=((super.getVoltaje()/super.getResistencias()));
		super.setIntensidad(intensidad);
		return intensidad;
	}	//Metodo heredado de la clase Circuitos pero modificado para calcular la intensidad siendo un circuito en serie.

	
	//TO STRING
	public String toString () {
		return super.toString()+"Resistencia total: "+super.getResistencias()+" Ω\nIntensidad: "+CalcularIntensidad()+" A\n";
	}
	
}
