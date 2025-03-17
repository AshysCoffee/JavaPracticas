package ejercicio_PruebaFigura;

public abstract class FiguraAbstracta {

	double posc_x, posc_y;
	Colores color;

	public FiguraAbstracta(double posc_x, double posc_y, Colores color) {
		this.posc_x = posc_x;
		this.posc_y = posc_y;
		this.color = color;
	}


	public double getPosc_x() {
		return posc_x;
	}

	public void setPosc_x(double posc_x) {
		this.posc_x = posc_x;
	}

	public double getPosc_y() {
		return posc_y;
	}

	public void setPosc_y(double posc_y) {
		this.posc_y = posc_y;
	}

	public abstract double Area();
	
	public abstract double Perimetro();
	
	public abstract String mostrarPosicion();
	
	public String toString() {
		return "Posición: "+posc_x+" , "+posc_y+"\nColor: "+color+"\n";
	}
	
	
}
