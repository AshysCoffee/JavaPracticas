package myString;

import java.util.*;

public class MyString {

	//ATRIBUTOS
	private char[] cadena;


	//CONSTRUCTOR
	public MyString(String c){
		this.cadena = new char[c.length()]; //debemos iniciar el array del mismo tamaño que el string
		for (int i=0; i<c.length(); i++) {
			this.cadena[i]=c.charAt(i);
		}	
	}

	public MyString(char [] c){
		this.cadena = new char [c.length]; //debemos iniciar el array del mismo tamaño que el array
		for (int i=0; i<c.length; i++) {
			this.cadena[i]=c[i];
		}
	}

	public MyString(ArrayList<Character> c){
		this.cadena = new char [c.size()]; //debemos iniciar el array del mismo tamaño que el arraylist
		for (int i=0; i<c.size(); i++) {
			this.cadena[i]=c.get(i);
		}
	}


	//METODOS
	public char[] getCadena(){
		return cadena;
	}

	public char myCharAt(int i) throws Exception{


		if (i<=cadena.length) {//si el numero es menor a la cadena, se puede buscar
			return cadena[i];
		}

		if ((i>cadena.length)||(i<0)) { //si es mayor o menor a la cadena, saldra una excepción
			throw new Exception("Esta fuera del rango");
		}

		return ' ';

	}


	public int myCompareTo(MyString cadena2){

		for (int j=0; j<cadena2.myLength(); j++) { //iniciamos un for para recorrer ambos arrays

			if (this.cadena[j] < cadena2.cadena[j]) { //iniciamos las condiciones
				return this.cadena[j] - cadena2.cadena[j];

			}else{
				if (this.cadena[j] > cadena2.cadena[j])
					return this.cadena[j] - cadena2.cadena[j];

			}
		}	
		return 0; // si son iguales en todos los ambitos dara 0
	}
	

	public int myCompareToIgnoreCase(MyString cadena2){
		
		MyString cadena_lower = this.myToLowerCase(); // volvemos ambas cadenas LowerCase ppor si hay mayus
		MyString cadena2_lower = cadena2.myToLowerCase();
		

		for (int j=0; j<cadena2.myLength(); j++) {

			if (cadena_lower.cadena[j] < cadena2_lower.cadena[j]) {
				return cadena_lower.cadena[j] - cadena2_lower.cadena[j];

			}else{
				if (cadena_lower.cadena[j] > cadena2_lower.cadena[j])
					return cadena_lower.cadena[j]-cadena2_lower.cadena[j];

			}	
		}	

		return 0;
	}

	
	public String myConcat(MyString cadena2){  //concatenamos dos cadenas que volvemos String

		String cadena_original = new String (cadena);

		String s="";

		s+=cadena_original;
		s+=cadena2.toString();

		return s;
	}

	
	public int myIndexOf(int caracter){ //devuelve la posicion del caracter, contando desde el principio

		if (this.cadena == null || this.cadena.length == 0) {
			return -1;
		}

		for (int j=0; j<cadena.length; j++) {
			if (this.cadena[j] == caracter) {
				return j;
			}

		}return -1; 
	}

	
	public int myLastIndexOf(int caracter){ //devuelve la posicion del caracter, contando desde el ultimo elemento del array

		if (this.cadena == null || this.cadena.length == 0) {
			return -1;
		}
		for (int j = this.cadena.length - 1; j >= 0; j--) {
			if (this.cadena[j] == caracter) {
				return j;
			}
		}
		return -1; 
	}

	
	public int myLength(){ //devuelve el tamaño de la palabra contando espacios
		int contador=0;

		for (int i=0; i<cadena.length; i++) {
			contador++;
		}
		return contador;
	}

	
	public MyString myReplace(char antiguo, char nuevo){ //sustituye un char por otro en un array

		char[] nueva = new char[cadena.length];

		for (int i=0; i<cadena.length; i++) {
			nueva[i] = cadena[i];
			if (nueva[i]==antiguo) {
				nueva[i]= nuevo;
			}
		}
		return new MyString(nueva);
	}
	
	
	public MyString[] mySplit(char expresion) {
		
		int principio=0, indice_array=0;
		MyString [] palabras = new MyString[100];
		
		for (int i=0; i<cadena.length; i++) {
			if (this.cadena[i]==expresion) {
				
					try {// i es el índice del separador, así que el contenido va hasta i - 1
						palabras[indice_array]=this.mySubstring(principio, i);
						indice_array++;
					} catch (Exception e) {
						e.getMessage();
					}
					
					principio=i+1;
				}
			
		}

		 if (principio < cadena.length) { // Añadir la última palabra si queda algo después del último separador
		        try {
		            palabras[indice_array] = this.mySubstring(principio, cadena.length);
		            indice_array++;
		        } catch (Exception e) {
		        	e.getMessage();
		        }
		    }
	
		 
		MyString[] resultado = new MyString[indice_array];
	    
	    for (int i = 0; i < indice_array; i++) {
				resultado[i] = palabras[i];
	    }
		
	    
	    return resultado;
	}
	

	public MyString mySubstring(int inicio, int fin) throws Exception{

		char[] nueva = new char[fin-inicio];

		for (int i=inicio; i<fin; i++) {
			nueva[i-inicio] = cadena[i];
		}

		if ((fin>cadena.length)||(inicio<0)||(inicio>fin)) {
			throw new Exception("Esta fuera del rango");
		}

		return new MyString(nueva);
	}

	
	public MyString myToLowerCase(){ //aqu se suma 32 en asccii para mayus y restar 32 para minus

		char[] nueva = new char[cadena.length];

		for (int i=0; i<cadena.length; i++) {
			nueva[i] = cadena[i];
			if (nueva[i]>='A'&& cadena[i]<='Z') {
				nueva[i]+=32;
			}
		}


		return new MyString(nueva);
	}

	
	public MyString myToLowerCase(char[] cadena){

		for (int i=0; i<cadena.length; i++) {
			if (cadena[i]>='A'&& cadena[i]<='Z') {
				cadena[i]+=32;
			}
		}

		return new MyString(cadena);
	}


	public MyString myToUpperCase(){
		char[] nueva = new char[cadena.length];

		for (int i=0; i<cadena.length; i++) {
			nueva[i] = cadena[i];
			if (nueva[i]>='a'&& cadena[i]<='z') {
				nueva[i]-=32;
			}
		}
		return new MyString(nueva);
	}


	public void imprimir(){

		String s="";
		if(cadena.length>0) {
			for (int i=0; i<cadena.length; i++) {
				s+=cadena[i];
			}
		} 
		System.out.println(s);
	}
	

	public String myToString(){
		String s="";

		if(cadena.length>0) {
			for (int i=0; i<cadena.length; i++) {
				s+=cadena[i];
			}
		} return s;

	}


	public String toString() {
		return this.myToString();
	}


}
