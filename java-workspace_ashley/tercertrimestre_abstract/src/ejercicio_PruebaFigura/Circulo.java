package ejercicio_PruebaFigura;

public class Circulo extends FiguraAbstracta {

	private double radio, diametro, area, perimetro;
	final double pi= 3.14;
	
	public Circulo( double posc_x, double posc_y, double radio, double diametro, Colores color) {
		super( posc_x, posc_y, color);
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

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	//////
	public double Area() {
		return area=pi*(radio*radio);
	}
	
	public double Perimetro() {
		return perimetro=pi*this.diametro;
	}
	
	public String mostrarPosicion() {
		return +posc_x+" , "+posc_y;
	}
	
	public String toString () {
		return "Circulo-----\n"+super.toString()+ "Radio: "+radio+"\nDiametro: "+diametro+"\nArea: "+Area()+"\nPerimetro: "+Perimetro()+"\n";
	}
	
	
}
