package interf.figura;

public class Rectangulo extends FiguraAbstracta implements Transformable, Colorable{
	
	private double base, altura, area, perimetro;

	public Rectangulo(double base, double altura, Colores color) {
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
	
	
	///////
	public double Area() {
		return this.area=this.base*this.altura;
	}
	
	public double Perimetro() {
		return this.perimetro=(this.base*2)+(this.altura*2);
	}	
	
	
	public void cambiarColor(Colores color) {
		this.color=color;
	}


	public Colores IndicaColor() {
		return super.color;
	}


	public void Escalar(double factor) {
		this.base*=factor;
		this.altura*=factor;
		this.area*=factor;
		this.perimetro*=factor;
	}
	
	public String toString() {
		return "Rectangulo-----\n"+super.toString()+"Area: "+Area()+"\nPerimetro: "+Perimetro()+"\n";
	}

	
	

}
