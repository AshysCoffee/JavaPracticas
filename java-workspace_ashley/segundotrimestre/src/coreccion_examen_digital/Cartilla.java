//Autor: Ashley Leon Espinoza
//Fecha: 25/02/2025

package coreccion_examen_digital;

public class Cartilla {

	//ATRIBUTOS
		private String fecha;
		private int anno_nacimiento, numVacuna=0, numEnfermedad=0;
		private String nombre_vet;

	
	//CONSTRUCTOR
		public Cartilla(String fecha, int anno_nacimiento, String nombre_vet) {
			super();
			this.fecha = fecha;
			this.anno_nacimiento = anno_nacimiento;
			this.nombre_vet = nombre_vet;
		}

	//GETTERS - Para obtener la información del atributo
	//SETTERS - Para cambiar los atributos mediante parametros externos
		public int getAnno_nacimiento() {
			return anno_nacimiento;
		}

		public void setAnno_nacimiento(int anno_nacimiento) {
			this.anno_nacimiento = anno_nacimiento;
		}


		public String getNombre_vet() {
			return nombre_vet;
		}

		public void setNombre_vet(String nombre_vet) {
			this.nombre_vet = nombre_vet;
		} 
		
		
		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}


		public int getNumVacuna() {
			return numVacuna;
		}


		public void setNumVacuna(int numVacuna) {
			this.numVacuna=numVacuna;
		}


		public int getNumEnfermedad() {
			return numEnfermedad;
		}


		public void setNumEnfermedad(int numEnfermedad) {
			this.numEnfermedad=numEnfermedad;
		}

}
