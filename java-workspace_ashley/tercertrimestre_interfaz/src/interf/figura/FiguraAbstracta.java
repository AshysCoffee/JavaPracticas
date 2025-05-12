 package interf.figura;

public abstract class FiguraAbstracta implements Colorable, Transformable{

	//ATRIBUTOS
	Colores color;

	//CONSTRUCTOR
	public FiguraAbstracta(Colores color) {
		this.color = color;
	}

	//METODOS
	public abstract double Area();
	
	public abstract double Perimetro();
	
	//TO STRING
	public String toString() {
		return "Color: "+color+"\n";
	}
	
	
}
