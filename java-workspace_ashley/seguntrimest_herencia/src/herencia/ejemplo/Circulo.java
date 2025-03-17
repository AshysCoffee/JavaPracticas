package herencia.ejemplo;

public class Circulo extends Figura {

	private double radio, diametro;
	final double pi= 3.14;
	
	public Circulo (String color, double radio, double diametro) {
		super(color);
		this.radio = radio;
		this.diametro = diametro;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double Area(double radio) {
		return pi*(radio*radio);
	}
	
	public double Perimetro(double diametro) {
		return pi*diametro;
	}
	
	public String toString() {
		String s;
		s=("----- Circulo\n");
		s+=(super.toString());
		s+=("Área: "+ Area(radio)+"\n");
		s+=("Perímetro "+ Perimetro(diametro)+"\n");
		return s;
	}
	
}
