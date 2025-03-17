package poo.calculadora;

import java.util.Scanner;

public class CalculadoraTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculador c1 = new Calculador();
		char operacion = ' ';
		System.out.println(c1.toStringCalculadora());
		System.out.println("Por favor, indique la operación que quiere realizar \"+\", \"-\", \"* \", \"/\", \"%\" o \".\" para finalizar.");
		System.out.println("En caso de guardar en la memoria 1 use \">\", y para cargarla \"<\".");
		System.out.println("En caso de guardar en la memoria 2 use \"[\", y para cargarla \"]\".");

		do {
			operacion=sc.next().charAt(0);
			switch(operacion) {
			case '+':
				System.out.println("Ingrese sus valores uno por uno:");
				c1.setAcumulador(sc.nextDouble());
                c1.sumar(sc.nextDouble());
                System.out.print(c1.toStringCalculadora());
                break;
                
            case '-':
            	System.out.println("Ingrese sus valores uno por uno:");
            	c1.setAcumulador(sc.nextDouble());
            	c1.restar(sc.nextDouble());
                System.out.print(c1.toStringCalculadora());
                break;
                
            case '*':
            	System.out.println("Ingrese sus valores uno por uno:");
            	c1.setAcumulador(sc.nextDouble());
            	c1.multiplicar(sc.nextDouble());
                System.out.print(c1.toStringCalculadora());
                break;
                
            case '/':
            	System.out.println("Ingrese sus valores uno por uno:");
            	c1.setAcumulador(sc.nextDouble());
            	c1.dividir(sc.nextDouble());
                System.out.print(c1.toStringCalculadora());
                break;
                
            case '%':
            	System.out.println("Ingrese sus valores uno por uno:");
            	c1.setAcumulador(sc.nextDouble());
            	c1.porcentaje(sc.nextDouble());
                System.out.print(c1.toStringCalculadora());
                break;
                
            case '>':
            	System.out.println("Ingrese su valor:");
            	c1.setAcumulador(sc.nextDouble());
            	c1.guardarMemoria1();
            	System.out.print(c1.toStringCalculadora());

                
            case '<':
            	System.out.println("Ingrese su valor:");
            	c1.setAcumulador(sc.nextDouble());
            	c1.cargarDeMemoria1();
            	System.out.print(c1.toStringCalculadora());

            case '[':
            	System.out.println("Ingrese su valor:");
            	c1.setAcumulador(sc.nextDouble());
            	c1.guardarMemoria2();
            	System.out.print(c1.toStringCalculadora());

                
            case ']':
            	System.out.println("Ingrese su valor:");
            	c1.setAcumulador(sc.nextDouble());
            	c1.cargarDeMemoria2();
            	System.out.print(c1.toStringCalculadora());
			}
		}while (operacion!='.');
		
		if (operacion=='.') {
			System.out.println("Finalizo la calculadora");
		}
	sc.close();
	}
}
