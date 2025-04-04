package ejercicioCircuito;

import java.util.ArrayList;

public class Placa{

	protected ArrayList <Circuitos> Circuitos = new ArrayList<Circuitos>();
	private String nombre_placa;
	
	//CONSTRUCTOR
	public Placa(String nombre_placa) {
		this.nombre_placa=nombre_placa;
		this.Circuitos= new ArrayList <Circuitos>();
	}
	
	
	//GETTERS Y SETTER
	public String getNombre_placa() {
		return nombre_placa;
	}

	public void setNombre_placa(String nombre_placa) {
		this.nombre_placa = nombre_placa;
	}

	//METODOS
	public void addCircuito (Circuitos c) {
		Circuitos.add(c);	
		
	}	

	public void deleteResistencia (Circuitos c) {
		Circuitos.remove(c);	
	}	
	
	
	
	
}
