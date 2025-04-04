package herencia.cuenta;

public class CuentaCorriente extends Cuenta{

	private int sobregiro=0; //osea sacar mas dinero al que se puede

	public CuentaCorriente(float saldo, float tasa_anual) {
		super(saldo, tasa_anual);
	}

	public int getSobregiro() {
		return sobregiro;
	}

	public void setSobregiro(int sobregiro) {
		this.sobregiro = sobregiro;
	}
	
	public void Ingresar (int cantidad) {
		super.Ingresar(cantidad);
		if (super.getSaldo()<0 && sobregiro>1) {
			super.setSaldo(getSaldo()+cantidad);
		}
	}

	public void Retirar (int cantidad) {
		if (cantidad>super.getSaldo()) {
			sobregiro++;
			super.setSaldo(getSaldo()-cantidad);
		}
	}
	
	public void ExtractoMensual () {
		super.ExtractoMensual();
	}
	
	public int TranssTotal () {
		int transtotales=0;
		transtotales= super.getIngresos()+super.getRetiros();
		return transtotales;
	}
	
	public String toString() {
		String s="";
		s+=("Usted tiene "+super.getSaldo()+"€ en la cuenta"+"\n");
		s+=("Ha realizado "+super.getIngresos()+" ingresos"+"\n");
		s+=("Ha realizado "+super.getRetiros()+" retiros"+"\n");
		s+=("Su comision mensual es de "+ super.getComision_mensual()+"\n");  
		s+=("Ha realizado "+TranssTotal()+" operaciones"+"\n");
		s+=("---------------------------------\n");
		return s;
	}
	
}

/*-Cuenta corriente: posee un atributo de sobregiro, el cual se inicializa en cero. Se redefinen los siguientes métodos:
 		*Retirar: se retira dinero de la cuenta actualizando su saldo. Se puede retirar dinero superior al saldo. El dinero que se debe queda
		como sobregiro.
 		*Consignar: invoca al método heredado. Si hay sobregiro, la cantidad consignada reduce el sobregiro.
 		*Extracto mensual: invoca al método heredado.
 		*Un nuevo método imprimir que muestra en pantalla el saldode la cuenta, la comisión mensual, el número de transacciones
realizadas (suma de cantidad de consignaciones y retiros) y el valor de sobregiro.
*/