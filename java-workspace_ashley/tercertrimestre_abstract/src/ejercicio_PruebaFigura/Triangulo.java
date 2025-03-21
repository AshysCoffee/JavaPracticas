package ejercicio_PruebaFigura;

public class Triangulo extends FiguraAbstracta{

	private double altura, base, lado_1, lado_2, lado_3, area, perimetro;

	public Triangulo( double posc_x, double posc_y, Colores color, double altura,
			double base, double lado_1, double lado_2 , double lado_3) {
		super(posc_x, posc_y, color);
		this.altura = altura;
		this.base = base;
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
		return this.area=(this.base*this.altura)/2;
	}
	
	public double Perimetro() {
		return this.perimetro=lado_1+lado_2+lado_3;
	}
	
	public String mostrarPosicion() {
		return +posc_x+" , "+posc_y;
	}
	
	public String toString() {
		return "Triangulo-----\n"+super.toString()+"Lado 1: "+lado_1+"\nLado 2: "+lado_2+"\nLado 3: "
				+lado_3+"\nAltura: "+altura+"\nBase: "+base+"\nArea: "+Area()+"\nPerimetro: "+Perimetro()+"\n";
	}
}
