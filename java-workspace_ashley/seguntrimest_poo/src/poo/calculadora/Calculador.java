package poo.calculadora;

public class Calculador {

	private double acumulador, memoria1, memoria2;

	public Calculador() {
		this.acumulador = 0;
		this.memoria1=0;
		this.memoria2=0;
	}
////////////////

	public void setAcumulador(double acumulador) {
		this.acumulador = acumulador;
	}

//////////

	public void sumar(double valor) {
        this.acumulador += valor;
    }

    public void restar(double valor) {
        this.acumulador -= valor;
    }

    public void multiplicar(double valor) {
        this.acumulador *= valor;
    }

    public void dividir( double valor) {
        if (valor != 0) {
        	this.acumulador /= valor;
        } else {
        	this.acumulador=0.0;
        }
    }

    public void porcentaje( double porcentaje) {
    	this.acumulador = acumulador * (porcentaje / 100);
    }
///////////  
	
    public void guardarMemoria1() {
    	this.memoria1 = this.acumulador;
    } 

    public void guardarMemoria2() {
    	this.memoria2 = this.acumulador;
    }

    public void cargarDeMemoria1() {
    	this.acumulador = this.memoria1;
    }

    public void cargarDeMemoria2() {
    	this.acumulador = this.memoria2;
    }

    public void limpiarMemoria1() {
    	this.memoria1 = 0.0;
    }

    public void limpiarMemoria2() {
    	this.memoria2 = 0.0;
    }

    // Métodos para manejar el acumulador
    public void limpiaracumulador() {
    	this.acumulador = 0.0;
    }

    public double obteneracumulador() {
        return this.acumulador;
    }
	
	public String toStringCalculadora() {
		String s;
		s=("Memoria 1: " +memoria1+ "\n");
		s+=("Memoria 2: " +memoria2+ "\n");
		s+=("Resultado: "+acumulador+"\n");
		return s;
	}
	
}
