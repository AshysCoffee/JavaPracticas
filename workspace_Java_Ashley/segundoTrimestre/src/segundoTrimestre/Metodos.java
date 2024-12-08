package segundoTrimestre;

public class Metodos {
	
	public static int esCapicua (int x[]) {
		int capicua;
		capicua=0;
		
		for (int i=0; i<x.length+1; i++) {
		for (int j=x.length-1; j>-1; j-- )
		do {	
			
			if (x[0]!=x[x.length-1]) {
				System.out.println("No es capicua");
				break;
			}
			if (x[i]==x[j]) {
			capicua++;
			}
		}while (capicua!=x.length);
		
		if (x[0]!=x[x.length-1]) {
			System.out.println("No es capicua");}
		
		if (capicua!=x.length) {
			System.out.println("No es capicua");
			}else{
				if (capicua==x.length) {
					System.out.println("");
					System.out.println("Si es capicua");
					break;
				}
			}
		}
		return capicua;
	}

	public static void SumaArray (int x[], int y[], int z[]) {
		for (int i=0; i<z.length; i++){
			z[i]=x[i]+y[i];
		}
	}
	
	public static int Repeticion (int x[], int valor, int contador) {
		contador=0;
		for (int i=0; i<x.length-1;i++) {
			if (x[i]==valor) {
				contador++;
				System.out.println("Esta en la posición: "+i);
			}
		}
		System.out.println("Hay "+contador+" veces repetidas el valor "+valor+"");
		return -1;//lmao aqui se pone el -1 xD
	}
	
	public static void DuplicaValorArray(int x []) { //paso por referencia (tipos clase + tipo arrays)
		for (int i=0; i<x.length-1;i++) {
		x[i]*=2;
		System.out.print(+x[i]);
		System.out.print("|");
		}
	}
	
	public static void FusionaArrays (int x[], int y[], int z[]) {
		
		z = new int [x.length+y.length];
		
		for (int i=0; i<x.length; i++) {
			z[i]=x[i];
			System.out.print(""+z[i]+"");
			System.out.print(",");

			}
		for (int i=0; i<y.length; i++) {
			z[i]=y[i];
			System.out.print(",");
			System.out.print(""+z[i]+"");
		}
	}
	
	public static int Interseccion (int x[], int y[]) {
		for (int i=0; i<x.length-1;i++) {
			for (int j=0; j<y.length+1; j++) {
		
			if (x[i]==y[j]) {
				System.out.println(+i);
				return i;
			}
		}
		}
		return -1;
	}
}//nunca borrar
