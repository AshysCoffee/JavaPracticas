package herencia.cuenta;

public class CuentasTest {

	public static void main(String[] args) {
		
		Cuenta c1 = new CuentaAhorros (14500, 5);
		
		System.out.println(((CuentaAhorros)c1).isActiva()+"\n");
		System.out.println(((CuentaAhorros)c1).toString());
		
		
		Cuenta c2 = new CuentaCorriente (15582, 2);
		
		System.out.println(((CuentaCorriente)c2).toString());
		

		c1.ExtractoMensual();
		c2.ExtractoMensual();
			
		
		System.out.println("Deducciendo el Extracto Mensual las cuentas quedaran a: \n");
		System.out.println((c1).toString());
		System.out.println((c2).toString());
		
		try {
			c1.Retirar(50000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
