package herencia.granalmacen;

public class Alimentacion extends Productos {

	private int dia, mes, hora;

	public Alimentacion(double precio, double cod_barras, String nombre, int dia, int mes, int hora) {
		super(precio, cod_barras, nombre);
		this.dia = dia;
		this.mes = mes;
		this.hora = hora;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	

	public String toString () {
		String s="";
		s+=("Alimentación:\n");
		s+=(super.toString()+"\n");
		s+=(getPrecio()+"\n");
		s+=("Fecha de Caducidad: "+dia+"/"+mes+"\t"+hora+":00");
		return s;
	}
	
	
}
