package myString;

public class TestString {

	public static void main(String[] args) {
		
 
		String s1 = "Perro Pluto";
		String s2 = "Vaca Lola";
		String s3 = "Raton Mickey";

		//Prueba del uso de split;
		String texto = "manzana,pera,plátano";
		String[] frutas = texto.split(",");
		for (String fruta : frutas) {
		    System.out.println(fruta);
		}

		
		System.out.println(s3.charAt(7)); //da la letra en la posicion que pude (los espacios no cuentan)
		System.out.println();

		System.out.println(s2.compareTo(s1));
		System.out.println();
		
		System.out.println(s1.compareToIgnoreCase(s3));
		System.out.println();
		
		System.out.println(s1.concat(s3));
		System.out.println();
		
		System.out.println(s3.indexOf('p'));
		System.out.println();
		
		System.out.println(s2.lastIndexOf('a'));
		System.out.println();
		
		System.out.println(s3.length());
		System.out.println();
		
		System.out.println(s3.replace('M', 'P'));
		System.out.println();
		
		System.out.println(s2.substring(2,7));
		System.out.println();
		
		System.out.println(s2.toLowerCase());
		System.out.println();
		
		System.out.println(s1.toUpperCase());
		System.out.println();
		
		System.out.println(s3.trim()); // no porque no funciona :( 
		System.out.println();
		
		System.out.println(s3.toString());
		System.out.println();

		
	}

}
