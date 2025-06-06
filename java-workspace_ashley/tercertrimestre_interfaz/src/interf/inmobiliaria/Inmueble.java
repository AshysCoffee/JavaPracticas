package interf.inmobiliaria;

public class Inmueble {

	//ATRIBUTOS
	private String ubicacion;
	private double precio, metros_cuadrados;
	private int id;
	private static int id_inmueble= 1000;
	
	//CONSTRUCTORES
	public Inmueble (String ubicacion, double precio, double metros_cuadrados, int id) {
		this.ubicacion = ubicacion;
		this.precio = precio;
		this.metros_cuadrados = metros_cuadrados;
		this.id = id_inmueble++;
	}
	
	//GET-SETTERS
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getMetros_cuadrados() {
		return metros_cuadrados;
	}
	public void setMetros_cuadrados(double metros_cuadrados) {
		this.metros_cuadrados = metros_cuadrados;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//TO STRING
	public String toString() {
		String s=" ";
		s+=("ID: "+ id+"\n");
		s+=("Precio: "+precio+"\n");
		s+=("Metros cuadrados: "+metros_cuadrados+"\n");
		s+=("Ubicacion: "+ubicacion+"\n");
		return s;

	}
}

/*Se quiere modelar una agencia inmobiliaria para lo cual se deben
tener en cuenta las siguientes entidades e informaciones asociadas:


	a. Un inmueble viene dado por su ubicación y los metros
cuadrados que ocupa,precio y tienen un identificador. Hay dos tipos
de inmuebles: superficies y construcciones. Los primeros tienen su
precio por metro cuadrado.

A su vez, hay dos tipos de superficies: solares y plazas de garaje.
Los solares pueden estar en zona rústica o urbana. 
Las plazas de garaje pueden formar parte de un garaje público o de uno privado.

Por su parte, las construcciones pueden ser nuevas o de segunda mano.
Hay dos tipos de construcciones: viviendas y locales comerciales.
Las viviendas tienen dos precios(alquiler y venta), número de habitaciones y piso. 
Los locales tienen precio por metro cuadrado.

	
	
	b. La agencia que es queremos modelar se dedica a la venta y alquiler de inmuebles. 
	Ahora bien, solamente 
		alquila plazas de garaje y locales comerciales, 
		solo vende solares y viviendas. 
		Las viviendas también se pueden alquilar.
	
	
	c. La agencia inmobiliaria, es una conjunto de inmuebles de todos tipo.



Se pide:
	Definir la jerarquía de clases de forma que se cumplan los requisitos anteriores.
	
	Para cada una de las clases, definir su(s) constructora(s), métodos
	de acceso a cada uno de los atributos y un método toString() que
	escriba, de la manera que consideres más conveniente, la
	información de la entidad de que se trate.
	
	Definir addInmueble().
	
	Definir un método público precio() que calcula el precio que tiene
una superficie.
	
	Definir un método verTodasVentaInmueble(), que muestra todos
los inmuebles, la secuencia de inmuebles en venta de la agencia.
	
	Definir un método verTodosAlquilerInmueble(), que muestra todos
los inmuebles, la secuencia de inmuebles en alquiler de la agencia.
	
	Definir métodos que respondan a los siguientes servicios:

1. inmueblesVenta(p), que muestra los inmuebles con un precio de
venta inferior al parámetro.

2. localesSegundaMano(m), que muestra los locales comerciales de
segunda mano con una superficie superior al parámetro.

3. solaresRusticos(), que averigua cuántos solares no urbanos están
en venta.

4.Ver todas las viviendas a alquilar de más de dos dormitorios.

5.Ver todas las viviendas para comprar de más de 1 dormitorios.

6.Ver todos los garajes públicos.

7.Añade todas las funciones a la inmobiliaria que creas
convenientes.

Dos agencias inmobiliarias han decidido fusionarse. Define un
métodofusion(ag) dentro de la clase de las agencias inmobiliarias,
que permita crear una agencia nueva a partir de la agencia que
invoca el método y la del parámetro dado.*/