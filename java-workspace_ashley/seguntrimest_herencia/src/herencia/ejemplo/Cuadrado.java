package herencia.ejemplo;

public class Cuadrado extends Figura{
	
	private double lado;
	
	public Cuadrado (String color, double lado) {
		super(color); //asi se llama a un atributo de una clase padre a una clase hija
		this.lado=lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double Area() {
		return this.lado*this.lado;
	}
	
	public double Perimetro() {
		return this.lado*4;
	}	
	

	public String toString() {
		String s;
		s=("-----Cuadrado\n");
		s+=(super.toString());
		s+=("Área: "+ Area()+"\n");
		s+=("Perímetro "+ Perimetro()+"\n");//asi se llama el metodo de la clase padre a una hija
		return s;
	}
	
}
