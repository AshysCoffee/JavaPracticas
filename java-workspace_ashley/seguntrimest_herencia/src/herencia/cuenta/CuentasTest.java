package herencia.cuenta;

public class CuentasTest {

	public static void main(String[] args) {
		
		Cuenta c1 = new CuentaAhorros (1500, 5);
		
		System.out.println(((CuentaAhorros)c1).isActiva()+"\n");
		System.out.println(((CuentaAhorros)c1).toString());
		
		
		Cuenta c2 = new CuentaCorriente (1482, 2);
		
		System.out.println(((CuentaCorriente)c2).toString());
		

		c1.ExtractoMensual();
		c2.ExtractoMensual();
			
		
		System.out.println("Deducciendo el Extracto Mensual las cuentas quedaran a: \n");
		System.out.println((c1).toString());
		System.out.println((c2).toString());
		
		c2.Retirar(2000);

		System.out.println((c2).toString());
		
	}

}
