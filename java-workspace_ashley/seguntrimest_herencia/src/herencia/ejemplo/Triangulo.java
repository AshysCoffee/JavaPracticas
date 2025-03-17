package herencia.ejemplo;

public class Triangulo extends Figura {

	private double altura, base;

	public Triangulo(String color, double altura, double base) {
		super(color);
		this.altura = altura;
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}
	
	public double Area(double altura,double base) {
		return (base*altura)/2;
	}
	
	
	


	public String toString() {
		String s;
		s=("-----Triangulo\n");
		s+=(super.toString());
		s+=("Área: "+ Area(altura,base)+"\n");
		return s;
	}
}
