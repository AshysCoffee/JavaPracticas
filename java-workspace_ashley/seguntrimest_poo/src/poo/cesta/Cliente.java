package poo.cesta;

public class Cliente {
	
	private String nombre, apellidos, empresa, 	dni;
	private TipoCesta tipo;
	
	public Cliente(String nombre, String apellidos, String dni, TipoCesta tipo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.tipo = tipo;
	}
	
	
	public Cliente(String nombre, String apellidos, String empresa, String dni, TipoCesta tipo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.empresa = empresa;
		this.dni = dni;
		this.tipo = tipo;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getDNI() {
		return dni;
	}
	public void setDNI(String dni) {
		this.dni = dni;
	}
	public TipoCesta getTipo() {
		return tipo;
	}
	public void setTipo(TipoCesta tipo) {
		this.tipo = tipo;
	}
	
	public String toStringParticular() {
		String s="";
		s+=("Pedido por: "+nombre+" "+apellidos+"\n");
		s+=("DNI: "+dni+"\n");
		s+=("De encargo: "+tipo+"\n");
		return s;
	}
	
	public String toStringEmpresa() {
		String s="";
		s+=("Pedido por: "+nombre+" "+apellidos+"\n");
		s+=("DNI: "+dni+"\n");
		s+=("De encargo: "+tipo+"\n");
		s+=("Empresa: "+empresa+"\n");
		return s;
	}
	
}
