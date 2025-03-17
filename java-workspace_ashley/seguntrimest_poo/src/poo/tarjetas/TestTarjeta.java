package poo.tarjetas;

import java.util.Scanner;

public class TestTarjeta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tarjetas t1 = new Tarjetas("5465", 1000.55, 6824, 300);
		System.out.println(t1.toStringTarjeta());
		int operacion=0;
		int limite=0;
		int pin=0;
		do {
			System.out.println("Bienvenido al banco FiSn");
			System.out.println("Seleccione una operación:\n1. Consultar saldo\n2. Ingresar dinero\n3. Retirar dinero\n4. Modificar el límite de retirada\n5. Cerrar sesión\n");
			 operacion=sc.nextInt();
			 switch(operacion) {
				case 1:
					System.out.println("Este es su saldo actual: "+t1.getSaldo());
					
	            case 2:
	            	System.out.println("¿Cuánto desea ingresar en la cuenta (solo multiplos de 10)?"+t1.Ingresar(sc.nextInt()));
	            	System.out.println(t1.toStringTarjeta());
	            case 3:
	            	System.out.println("¿Cuánto desea retirar en la cuenta (solo multiplos de 10)?"+t1.Retirar(sc.nextInt()));
	            	System.out.println(t1.toStringTarjeta());
	            case 4:
	            	System.out.println("Modificára su límite actual "+(t1.getLimite_retirar())+"€");
	            	while (t1.getPin()!=pin) {
	            	System.out.print("Introduzca su PIN, para aprobar el cambio: ");
	            	System.out.println(t1.PinCorrecto(pin=sc.nextInt()));
	            	}
	            	System.out.print("Ingrese el nuevo límite: ");
	            	limite=sc.nextInt();
	            	t1.setLimite_retirar(limite);
	            	System.out.println(t1.toStringTarjeta());
	            case 5:	
	              default: 
	            	  break;
			 }	  
		}while (operacion!=5);
		
		sc.close();
	}

}
