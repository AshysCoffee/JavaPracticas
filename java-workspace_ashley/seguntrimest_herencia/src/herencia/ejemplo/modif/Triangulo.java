package herencia.ejemplo.modif;

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
	
	public double Area() {
		return (this.base*this.altura)/2;
	}
	
	public String colorPrimario () {
		if (this.getColor()=="Amarillo" || this.getColor()=="Cian" || this.getColor()=="Magenta") {
			return "Es color primario\n";
		}
		return "No es color primario\n";
	}
	


	public String toString() {
		String s;
		s=("-----Triangulo\n");
		s+=(super.toString());
		s+=("Área: "+ Area()+"\n");
		return s;
	}
}
