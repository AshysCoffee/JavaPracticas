package correcion_examen_escrito;

import java.util.ArrayList;

public class Equipo{
	
	//ATRIBUTOS
	private ArrayList<Ciclista> Equipo; //declaramos el array dentro de la clase.
	private String nombre_equipo, pais;
	private static float Tiempo_Total=0;
	
	//CONSTRUCTOR
	public Equipo(String nombre_equipo, String pais) {
		this.nombre_equipo = nombre_equipo;
		this.pais = pais;
		this.Equipo=new ArrayList<Ciclista>(); //creamos el array
	}
	
	//GETTERS Y SETTERS
	public String getNombre_equipo() {
		return nombre_equipo;
	}
	public void setNombre_equipo(String nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}

	public static float getTiempo_Total() {
		return Tiempo_Total;
	}

	//METODOS
	public void AddCiclista(Ciclista c) {	//Método para añadir un ciclista al arraylist
		Equipo.add(c);
	}
	
	public void DeleteCiclista(Ciclista c) {	//Método para eliminar un ciclista al arraylist
		Equipo.remove(c);
	}
	
	public String SumaTotal() {		//Método para calcular el tiempo total
		String s=" minutos";
		for ( Ciclista c : Equipo) {
		Tiempo_Total+=c.getTiempoCarrera();
		}
		return Tiempo_Total+s;
	}	
	
	public String ListarCiclistas () { 		//Método para listar a todos los ciclistas al arraylist
		String s="";
		for (Ciclista c:Equipo) {
			s+=c.toString()+"\n";
		}return s;
	}	
	
	public String BuscarCiclista (int id) { 	//Método para buscar un ciclista en el arraylist segun el id
		String s="";
		for (Ciclista c:Equipo) {
			if (c.getId()==id) {
				s=(c.toString()+"\n");
			}else{
				s="No se ha encontrado a ningun ciclista con ese ID "+id;
			}
		}
		return s;
	}
	
	//TO STRING
	public String toString() {
		String s="";
		s+=("Equipo: "+nombre_equipo+"\n");
		s+=("País: "+pais+"\n");
		return s;
	}
	
}
