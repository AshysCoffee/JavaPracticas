package poo.rectagulo;

public class Rectangulo {
	private int altura, base, area, perimetro;

	public Rectangulo(int altura, int base){
		this.altura=altura;
		this.base=base;
		this.area=base*altura;
		this.perimetro=(base+altura)*2;
	}

	public void setAltura(int altura){
		this.altura=altura;
	}
	public int getAltura(){
		return this.altura;
	}

	public void setBase(int base){
		this.base=base;
	}

	public int getBase(){
		return this.base;
	}
	
	public void setArea(int area){
		this.area=area;
	}

	public int getArea(){
		return this.area;
	}

	
	public void setPerimetro(int perimetro){
		this.perimetro=perimetro;
	}

	public int getPerimetro(){
		return this.perimetro;
	}

	
	public String toString(){
		String s;
		s=("Introduzca los datos de su rectangulo:\n");
		s+=("Altura: "+ altura +"\n");
		s+=("Base: "+ base +"\n");
		s+=("Área: "+ area +"\n");
		s+=("Perimetro: "+ perimetro +"\n");
		return s;
	}
}

//Crear una clase Rectángulo, con atributos base y altura. Crear también el constructor de la clase y los métodos necesarios para calcular el área y el perímetro. 
//Crear otra clase PruebaRectangulo que pruebe varios rectángulos y muestre por pantalla sus áreas y perímetros.