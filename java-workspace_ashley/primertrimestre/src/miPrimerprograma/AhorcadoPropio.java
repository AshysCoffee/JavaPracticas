package miPrimerprograma;

import java.util.Scanner;

public class AhorcadoPropio {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			new DibujoAhorcado();
			
			int i /*tamaño palabra*/, comprobador=1, fallos=0;
			char letras=9;
			char [] comprobador_letras = new char [27];
			boolean acertado = false;
			
			System.out.println("Escribe tu palabra letra a letra, cuando hayas terminado escribe un punto .");

			for (i=0; letras!='.'; i++) { //for para meter letras
				letras = sc.next().charAt(0);
				comprobador_letras[i]=letras;
				
			}

			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			
			char [] palabra_final = new char [i];
			char [] huecos = new char [palabra_final.length];
			
			//se copia palabra en el comprobador
			for (i=0; (i+1)<palabra_final.length;i++) {
				palabra_final[i] = comprobador_letras[i];
				huecos[i]='_';
				System.out.print(" "+huecos[i]+" ");
			}
			
			letras='a'; //iniciamos con a y el programa va sumando en ASCII solito
			
			
		for(int j=0; j<27; j++) {
			
			if(i==14) {
				comprobador_letras[i]= 'ñ';
			}else{
				comprobador_letras[i]=letras;
				letras++;
				}		
			}
		
			while ((fallos!=7)&&(comprobador!=huecos.length)) {
				
				System.out.println("");
				letras = sc.next().charAt(0);
				
				for (i=0; i<27; i++) {
					
					if ((i<palabra_final.length)&&(letras==palabra_final[i])) {
						huecos[i]=palabra_final[i];
						comprobador++;
						acertado=true;
					}
						
					if (letras==comprobador_letras[i]) {		
						comprobador_letras[i]='0';
						
					}
					
				}
				
					if (acertado!=true) {
						fallos++;
					}
					
				
				
				acertado=false;
				System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				for(i=0; (i+1)<palabra_final.length; i++) {
					System.out.print(" "+huecos[i]+" ");
				}
				
				
				System.out.println("\n\n FALLASTE " + fallos + " VECES            ");
				DibujoAhorcado.dibujo(fallos); //fallos es un numero que se mete en un switch
				System.out.println("\n\n FALTAN POR USAR LAS SIGUIENTES LETRAS:        ");
				for (i=0; i<comprobador_letras.length; i++) {
					if (comprobador_letras[i]!='0') {
						System.out.print(comprobador_letras[i]+",");
					}
				}
				
			}
				
				if (fallos==7) {
					System.out.println("\n\n PERDISTE CON "+ fallos +" FALLOS, BIEEEEEEN!!!!");
				}else{
					System.out.println("\n\n GANASTE CON "+ fallos +" FALLOS!!!!");
				}

			}

		}
		
}