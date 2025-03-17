package poo.contador;

public class Contador {
	
	private int valorinicial;
	
	public Contador(int valorinicial) {
		this.valorinicial=valorinicial;
	}

	public void Reiniciar() {
		this.valorinicial=0;
	}
	
	public void SumaUnitaria () {
		this.valorinicial++;
	}
	
	public void RestaUnitaria () {
		this.valorinicial--;
	}
	
	public void SumaModif (int contador) {
		this.valorinicial+=contador;
	}
	
	public void RestaModif (int contador) {
		this.valorinicial-=contador;
	}
	
	public String toString () {
		String s="";
		s+=("Valor actual: " + valorinicial+"\n");
		return s;
	}
	
}

//Modeliza un contador, que se incremente y decremente , en una unidad, en varias unidades, y se reinicie.