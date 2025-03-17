package pruebasCosas;

public abstract class FiguraAbstracta {

	double area, perimetro, mostrarPosicion;

	public FiguraAbstracta(double area, double perimetro, double mostrarPosicion) {
		this.area = area;
		this.perimetro = perimetro;
		this.mostrarPosicion = mostrarPosicion;
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

	public double getMostrarPosicion() {
		return mostrarPosicion;
	}

	public void setMostrarPosicion(double mostrarPosicion) {
		this.mostrarPosicion = mostrarPosicion;
	}
	
	public abstract double Area();
	
	public abstract double Perimetro();
	
	public abstract double mostrarPosicion();
	
	
}
