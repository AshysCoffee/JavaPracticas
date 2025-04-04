package ejercicioCircuito;

public class Paralelo extends Circuitos{

	private double intensidad_Total;
	
	//CONSTRUCTOR
	public Paralelo(double voltaje) {
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
	}		//Metodo heredado de la clase Circuitos
	
	public void DeleteResistencia (Resistencias r) {
		super.DeleteResistencia(r);
	}		//Metodo heredado de la clase Circuitos
	
	public double CalcularIntensidad() {
		for (Resistencias r: Resistencias) {
		double intensidad=(((super.getVoltaje()/r.getResistencia())));
		this.intensidad_Total+=intensidad;
		super.setIntensidad(this.intensidad_Total); 
		}

		return this.intensidad_Total;
	}	//Metodo heredado de la clase Circuitos pero modificado para calcular la intensidad siendo un circuito Paralelo.
	
	
	//TO STRING
	public String toString () {
		return super.toString()+"Resistencia total: "+super.getTotal_resistencias()+" Ω\nIntensidad: "+CalcularIntensidad()+" A\n";
	}
	
}
