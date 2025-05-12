package interf.inmobiliaria;

import java.util.ArrayList;

public class Agencia_Inmobiliaria {
	
	private ArrayList <Inmueble> Agencia;
	private String nombre_agencia;

	public Agencia_Inmobiliaria(String nombre_agencia) {
		Agencia = new ArrayList <Inmueble>();
		this.nombre_agencia=nombre_agencia;
	}
	

	public String getNombre_agencia() {
		return nombre_agencia;
	}

	public void setNombre_agencia(String nombre_agencia) {
		this.nombre_agencia = nombre_agencia;
	}


	public ArrayList<Inmueble> getAgencia() {
		return Agencia;
	}


	public void setAgencia(ArrayList<Inmueble> agencia) {
		Agencia = agencia;
	}


	public void addInmueble (Inmueble i) {
		Agencia.add(i);
	}
	
	public double precio(Inmueble i) {
		return i.getPrecio();
	}
	
	public String verTodasVentaInmueble() {
		String s="";
		for (Inmueble i:Agencia) {
			if (i instanceof Vendible)
			s+=(((Vendible)i).toString());
		}
		return s;
	}
	
	
	public String verTodasAlquilerInmueble() {
		String s="";
		for (Inmueble i:Agencia) {
			if (i instanceof Alquilable)
				s+=(((Alquilable)i).toString());
		}
		return s;
	}
	
	public String inmueblesVenta (int precio) {
		String s="";
		for (Inmueble i:Agencia) {
			if (i instanceof Vendible || i.getPrecio()<precio)
			s+=(((Vendible)i).toString());
		}
		return s;
	}
	
	public String localesSegundaMano(double metros) {
		String s="";
		for (Inmueble i:Agencia) {
			if (i instanceof Local_Comercial) {
				if ((((Local_Comercial)i).getEstado() == EstadoConstruccion.SEGUNDA_MANO) && i.getMetros_cuadrados()> metros);
				s+=(((Local_Comercial)i).toString());
			}
		}
		return s;
	}
	
	public String solaresRusticos() {
		String s="";
		for (Inmueble i:Agencia) {
			if (i instanceof Solar) {
				if ((((Solar)i).getZona() == TipoSolar.RUSTICO));
				s+=(((Solar)i).toString());
			}
		}
		return s;
	}
	
	public String viviendasMasHabit() {
		String s="";
		for (Inmueble i:Agencia) {
			if (i instanceof Vivienda) {
				if (i instanceof Alquilable) {
				if ((((Vivienda)i).getNumHabitaciones()>2));
				s+=(((Vivienda)i).toString());
				}
			}
		}
		return s;
	}
	
	public String garajesPublicos() {
		String s="";
		for (Inmueble i:Agencia) {
			if (i instanceof Plaza_Garaje) {
				if ((((Plaza_Garaje)i).getTipo()) == TipoGaraje.PUBLICA);
				s+=(((Plaza_Garaje)i).toString());
			}
		}
		return s;
	}

	
	public Agencia_Inmobiliaria FusionAgInmobiliaria (Agencia_Inmobiliaria ai) {
		 Agencia_Inmobiliaria nueva = new Agencia_Inmobiliaria(nombre_agencia);
		    
		    for (Inmueble i : Agencia) {
		        nueva.addInmueble(i);
		    }

		    for (Inmueble i : ai.Agencia) {
		        nueva.addInmueble(i);
		    }

		    return nueva;
	}
	
	
	
}
