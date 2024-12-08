package pruebas;

public class ArraysMetodos {
	public static int BinarySearch (int x[], int valor) {
		for (int i=0; i<x.length;i++) {
			if (x[i]==valor) {
				System.out.println(+i);
			}

		}
		
	int contador=0;
		for (int i=0; i<x.length;i++) {
			if (x[i]!=valor) {
				contador++;
				if(contador==x.length) {
					System.out.println("-1");
					}
				}

			}
			return -1;
		}
	
	
	public static int Compare (int x[], int y[]) {
		int contador=0;
		for (int i=0; i<x.length;i++) {
				if(x[i]==y[i]) {
				contador++;
				
			}

		}
		
		for (int i=0; i<x.length;i++) {
			if (x[i]!=y[i]) {
				contador++;
				if(contador==x.length) {
					System.out.println("-1");
					}
				}

			}
		return -1 ;
	}
}//no borrar
