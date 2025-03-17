package poo.tarjetas;

public class Tarjetas {

	private String num_cuenta;
	private double saldo;
	private int pin, limite_retirar;

	public Tarjetas(String num_cuenta, double saldo, int pin, int limite_retirar) {
		this.num_cuenta = num_cuenta;
		this.saldo = saldo;
		this.pin = pin;
		this.limite_retirar = limite_retirar;
	}
	////////////

	public String getNum_cuenta() {
		return num_cuenta;
	}

	public void setNum_cuenta(String num_cuenta) {
		this.num_cuenta = num_cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getLimite_retirar() {
		return limite_retirar;
	}

	public void setLimite_retirar(int limite_retirar) {
		this.limite_retirar = limite_retirar;
	}

	public String Ingresar (int valor) {
		String s="";
		this.saldo+=valor;
		s=("Se ha ingresado "+valor+", el saldo actual es de "+saldo);
		return s;
	}

	public String Retirar (int valor) {
		String s="";
		if (valor<this.limite_retirar && this.saldo-valor>200){
			saldo-=valor;
			s=("Se retirado "+valor);
		}

		if (saldo-valor<200) {
			s=("La cuenta no debe quedarse debajo de 200€.");
		}

		if (valor>limite_retirar) {
			s=("La cantidad escrita no puede superar el límite de "+limite_retirar);
		}
		return s;
	}

	public String PinCorrecto (int valor) {
		String s="";
		int intento=0;
		if (intento<4) {
			if(valor!=pin) {
				intento++;
				s=("El PIN es incorrecto, por favor intentélo de nuevo.");
			}	
		}
		
		if(valor==pin) {
			s=("El PIN es correcto");
		}	
		
		if(intento==4) {
			System.out.println("Su tarjeta fue bloqueada");
		}
		return s;
	}

	/////////
	public String toStringTarjeta() {
		String s;
		s=("-----------------\n");
		s+=("Tarjeta\n");
		s+=("IBAN: ****"+num_cuenta+"\n");
		s+=("Saldo actual: "+saldo+"€\n");
		s+=("Límite de retirada diaria actual: "+limite_retirar+"€\n");
		return s;
	}

}

/* Se pide que creéis una clase Tarjeta que tiene como características el número de cuenta que se asocia con la tarjeta, 
 * el saldo de la cuenta asociada a la tarjeta, el número secreto de la tarjeta y la cantidad máxima diaria a sacar. 
 * 
 * Con la clase Tarjeta se puede realizar movimientos como sacar dinero, 
 * ingresar dinero y consultar el saldo, también se puede realizar cambios en la 
 * cantidad máxima a sacar y realizar comprobaciones como introducir el número secreto 
 * y comprobar que sea el mismo que el de la tarjeta.
 * 
 *Dentro del método de sacar dinero se tiene que tener en cuenta dos condiciones: 
 *la primera es que no se puede dejar la cuenta en menos de 200 euros y la segunda que 
 *no se puede pedir sacar cantidades superiores a la cantidad máxima diaria. Si esto 
 *sucediera se tendría que sacar por pantalla un mensaje que dijera porqué no se ha podido ç
 *realizar la operación. 
 *
 *
 *MAINNNNNNNN
 *Se pide también crear un programa principal main (puede ser dentro de la clase Tarjeta o en otra clase) 
 *donde se cree un objeto tarjeta (o varios) y se añadan unas serie de datos. Por ejemplo: numero de cuenta 135, 
 *saldo disponible 2320 €, saldo máximo a sacar 500 € y el número secreto 3212
 *
 *Después realizar los pasos que supuestamente realizarías en un cajero: 
 *• Introducir el código clave y comprobar que es el correcto, si no dar un mensaje de error (esto se realiza llamando al método de la clase Tarjeta que implemente esta acción). 
 *• Si no da error sacar dinero de la cuenta. Podéis probar a sacar una cantidad superior a la permitida, etc. 

 **/
 