package herencia.cuenta;

public class Cuenta {

	private double saldo;
	private double tasa_anual , comision_mensual=0;
	private int ingresos=0, retiros=0;
	
	//CONSTRUCTORES
	public Cuenta(float saldo, float tasa_anual) {
		this.saldo = saldo;
		this.tasa_anual = tasa_anual;
	}

	//GETTERS Y SETTERS
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double getTasa_anual() {
		return tasa_anual;
	}


	public void setTasa_anual(double tasa_anual) {
		this.tasa_anual = tasa_anual;
	}


	public int getIngresos() {
		return ingresos;
	}


	public void setIngresos(int ingresos) {
		this.ingresos = ingresos;
	}


	public int getRetiros() {
		return retiros;
	}


	public void setRetiros(int retiros) {
		this.retiros = retiros;
	}


	public double getComision_mensual() {
		return comision_mensual;
	}


	public void setComision_mensual(double comision_mensual) {
		this.comision_mensual = comision_mensual;
	}
	
	//METODOS
	
	public void Ingresar (int cantidad) {
		this.saldo+=cantidad;
		this.ingresos++;
	}


	
	public void InteresMensual() { //el usuario pone la tasa
		double tasa_mensual = this.tasa_anual / 12;
		double interes_mensual = this.saldo * tasa_mensual;
			this.saldo += interes_mensual;
	}
	
	public void ExtractoMensual() {
		this.saldo-=this.comision_mensual;
		InteresMensual();
	}
	
	
	public void Retirar (int cantidad) throws Exception{
		
		if (saldo-cantidad<0) {
			throw new Exception("La cuenta no debe quedarse debajo de 0€.");
		}

		if (cantidad>saldo) {
			throw new Exception("La cantidad deseada a retirar no puede superar su saldo actual de "+saldo);
		}

		if (cantidad<this.saldo && this.saldo-cantidad>0){
			this.saldo-=cantidad;
			this.retiros++;
		}
	}
	
	
	public String toString() {
		String s="";
		s+=("Usted tiene "+this.saldo+"€ en la cuenta\n");
		s+=("Ha realizado "+this.ingresos+" ingresos\n");
		s+=("Ha realizado "+this.retiros+" retiros\n");
		s+=("Su comision mensual es de"+ comision_mensual+"\nY su tasa anual es "+tasa_anual+"\n");  
		return s;
	}
	
}
/*
*
*
*
*Desarrollar un programa que modele una cuenta bancaria que tiene los
siguientes atributos, que deben ser de acceso privado:
	-Saldo, de tipo float.	
	-Número de ingresos con valor inicial cero, de tipo int.
	-Número de retiros con valor inicial cero, de tipo int.
	-Tasa anual (porcentaje), de tipo float.
	-Comisión mensual con valor inicial cero, de tipo float.
	
	
*La clase Cuenta tiene un constructor que inicializa los atributos saldo
y tasa anual con valores pasados como parámetros. La clase Cuenta tiene
los siguientes métodos:
	-Al ingresar una cantidad de dinero en la cuenta actualizando su saldo.
	-Retirar una cantidad de dinero en la cuenta actualizando su saldo. El valor a retirar no debe superar el saldo.
	-Calcular el interés mensual de la cuenta y actualiza el saldo correspondiente.
	-Extracto mensual: actualiza el saldo restándole la comisión mensual y calculando el interés mensual correspondiente 
	(invoca el método anterior).
	-Imprimir: muestra en pantalla los valores de los atributos.

*/