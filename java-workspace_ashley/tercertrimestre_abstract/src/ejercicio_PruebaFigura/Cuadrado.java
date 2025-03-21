package ejercicio_PruebaFigura;

public class Cuadrado extends FiguraAbstracta{
	
	private double lado, area, perimetro;

	public Cuadrado(double posc_x, double posc_y, double lado, Colores color) {
		super( posc_x, posc_y, color);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
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
		return this.lado*this.lado;
	}
	
	public double Perimetro() {
		return this.lado*4;
	}	
	
	public String mostrarPosicion() {
		return +posc_x+" , "+posc_y;
	}
	
	public String toString() {
		return "Cuadrado-----\n"+super.toString()+"Lado: "+lado+"\nArea: "+Area()+"\nPerimetro: "+Perimetro()+"\n";
	}
	

}
