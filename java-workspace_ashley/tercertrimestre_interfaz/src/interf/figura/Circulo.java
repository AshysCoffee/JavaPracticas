package interf.figura;

public class Circulo extends FiguraAbstracta implements Transformable, Colorable{

	private double radio, diametro, area, perimetro;
	final double pi= 3.14;
	
	public Circulo(double radio, Colores color) {
		super(color);
		this.radio = radio;
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
		return  this.area=pi*(radio*radio);
	}
	
	public double Perimetro() {
		return this.perimetro=pi*(this.radio*2);
	}

	public void cambiarColor(Colores color) {
		this.color=color;
	}

	public Colores IndicaColor() {
		return super.color;
	}


	public void Escalar(double factor) {
		this.diametro*=factor;
		this.radio*=factor;
		this.area*=factor;
		this.perimetro*=factor;
	}
	
	public String toString () {
		return "Circulo-----\n"+super.toString()+ "Area: "+Area()+"\nPerimetro: "+Perimetro()+"\n";
	}
	
	
}
