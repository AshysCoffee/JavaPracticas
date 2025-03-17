package herencia.ejemplo.modif;

public class Figura {
	
	private String color;
	
	public Figura(String color) {
		this.color = color;
	}

	public double Area() {
		return 0;
	}
	
	public double Perimetro() {
		return 0;
	}

	public String getColor() {
		return color;
	}

	public double SumaTotalArea() {
		return 0;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public String toString() {
		String s;
		s=("Color: "+color+"\n");
		return s;
	}

	
	
}

/*
 *Declara e implementa las clases Triángulo, Círculo
y Cuadrado de forma que todas tengan un
atributo
 String color
y compartan los siguientes métodos:
 String dameColor()
 String toString()
 Imprimir los datos de la figura
 Calcular el área de la figura 
 * 
 * TODO ESTO ES HERENCIA.
 * */
 