package ejercicioCircuito;

public class Resistencias {

	protected double resistencia;

	public Resistencias(double resistencia) {
		this.resistencia= resistencia;
	}

	public double getResistencia() {
		return resistencia;
	}

	public void setResistencia(double resistencia) {
		this.resistencia = resistencia;
	}
	
	public double Resistencia_Total() {
		return 0;
	};
	
	public void AddResistencia (Resistencias r){
		
	};
	
	public void DeleteResistencia (Resistencias r) {
		
	};	
	
	public String toString () {
		return "Resistencia: "+resistencia;
	}
}
