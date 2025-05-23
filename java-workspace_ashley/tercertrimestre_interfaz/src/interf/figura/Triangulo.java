package interf.figura;

public class Triangulo extends FiguraAbstracta implements Transformable, Colorable{

	private double altura, base, lado_1, lado_2, lado_3, area, perimetro;

	public Triangulo( Colores color, double altura,
			double base, double lado_1, double lado_2 , double lado_3) {
		super(color);
		this.altura = altura;
		this.base = base;
		this.lado_1 = lado_1;
		this.lado_2 = lado_2;
		this.lado_3 = lado_3;
	}
	
	public Triangulo( Colores color, double lado_1, double lado_2 , double lado_3) {
		super(color);
		this.lado_1 = lado_1;
		this.lado_2 = lado_2;
		this.lado_3 = lado_3;
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
	
	
	public double getLado_1() {
		return lado_1;
	}

	public void setLado_1(double lado_1) {
		this.lado_1 = lado_1;
	}

	public double getLado_2() {
		return lado_2;
	}

	public void setLado_2(double lado_2) {
		this.lado_2 = lado_2;
	}

	public double getLado_3() {
		return this.lado_3;
	}

	public void setLado_3(double lado_3) {
		this.lado_3 = lado_3;
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
		return this.area=((this.lado_1*this.lado_2)*(Math.sqrt(3)))/4;
	}
	
	public double Perimetro() {
		return this.perimetro=lado_1+lado_2+lado_3;
	}
	
	public void cambiarColor(Colores color) {
		this.color=color;
	}


	public Colores IndicaColor() {
		return super.color;
	}


	public void Escalar(double factor) {
		this.lado_1*=factor;
		this.lado_2*=factor;
		this.lado_3*=factor;
		this.altura*=factor;
		this.base*=factor;
		this.area*=factor;
		this.perimetro*=factor;
		
	}
	
	public String toString() {
		return "Triangulo-----\n"+super.toString()+"Area: "+Area()+"\nPerimetro: "+Perimetro()+"\n";
	}
}
