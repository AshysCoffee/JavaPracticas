package ejercicioCircuito;

public class EnSerie extends Circuitos{

	private double intensidad_Total;

	//CONSTRUCTOR
	public EnSerie(double voltaje) {
		super(voltaje);
	}

	
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
	public void AddResistencia (Resistencias r) {
		super.AddResistencia(r);
	}	//Metodo heredado de la clase Circuitos
	
	public void DeleteResistencia (Resistencias r) {
		super.DeleteResistencia(r);
	}		//Metodo heredado de la clase Circuitos
	
	public double CalcularIntensidad() {
		double intensidad=((super.getVoltaje()/super.getTotal_resistencias()));
		intensidad_Total=intensidad;
		return intensidad;
	}	//Metodo heredado de la clase Circuitos pero modificado para calcular la intensidad siendo un circuito en serie.

	
	//TO STRING
	public String toString () {
		return super.toString()+"Resistencia total: "+super.getTotal_resistencias()+" Ω\nIntensidad: "+CalcularIntensidad()+" A\n";
	}
	
}
