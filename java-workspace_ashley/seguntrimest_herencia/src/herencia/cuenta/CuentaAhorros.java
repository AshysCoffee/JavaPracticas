package herencia.cuenta;

public class CuentaAhorros extends Cuenta{
	
	private boolean activa=true;

	public CuentaAhorros(float saldo, float tasa_anual) {
		super(saldo, tasa_anual);
	}

	public boolean isActiva() {
		if (super.getSaldo()<10000) {
			this.activa=false;
			System.out.println("La cuenta no es activa debido a que el saldo es menos a 10000$");
			return activa;
		}
		return activa=true;
	}

	public void Ingresar (int cantidad) {
		super.Ingresar(cantidad);
	}

	public void Retirar (int cantidad) throws Exception {
		super.Retirar(cantidad);
	}
	
	public void ExtractoMensual () {
		double nueva_comision=0;
		super.ExtractoMensual();
		if (super.getRetiros()>4) {
			nueva_comision=super.getComision_mensual()-1000;
			
		}
	}
	
	public int TranssTotal () {
		int transtotales=0;
		transtotales= super.getIngresos()+super.getRetiros();
		return transtotales;
	}
	
	public String toString() {
		String s="";
		s+=("Usted tiene "+super.getSaldo()+"€ en la cuenta"+"\n ");
		s+=("Ha realizado "+super.getIngresos()+" ingresos"+"\n");
		s+=("Ha realizado "+super.getRetiros()+" retiros"+"\n");
		s+=("Su comision mensual es de "+ super.getComision_mensual()+"\n");  
		s+=("Ha realizado "+TranssTotal()+" operaciones"+"\n");
		s+=("---------------------------------\n");
		return s;
	}

}

/*-Cuenta de ahorros: posee un atributo para determinar si la cuenta de ahorros está activa (tipo boolean). 
	Si el saldo es menor a $10000, la cuenta está inactiva, en caso contrario se considera activa. 
	Los siguientes métodos se redefinen:
 		*Consignar: se puede consignar dinero si la cuenta está activa. Debe invocar al método heredado.
 		*Retirar: es posible retirar dinero si la cuenta está activa. Debe invocar al método heredado.
 		*Extracto mensual: si el número de retiros es mayor que 4, por cada retiro adicional, se cobra $1000 como comisión mensual.
 		*Al generar el extracto, se determina si la cuenta está activa o no con el saldo.
 		*Un nuevo método imprimir que muestra en pantalla el saldo de la cuenta, la comisión mensual y el número de transacciones
		realizadas (suma de cantidad de consignaciones y retiros).*/