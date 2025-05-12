package interf.palindroma;

import java.util.ArrayList;

public class Palindroma {
	
	//ATRIBUTOS
	private ArrayList <Character> Frase;
	
	
	//CONSTRUCTOR
	public Palindroma() {
		this.Frase= new ArrayList <Character>();
	}

	

	public ArrayList<Character> getFrase() {
		return this.Frase;
	}
	
	
	
	//METODOS
	public void addPalindroma(char letra){
		Frase.add(letra);
	}
	
	public void deletePalindroma (char letra) {
		Frase.remove(letra);
	}



	public boolean esPalindroma () {
		
		for (int i=0; i<Frase.size()/2; i++) {//se divide a la mitad la medida porque no comparar dos veces lo mismo
			if (Frase.get(i)!=Frase.get(Frase.size()-1-i)) { // se resta 1 para que no salga del array y i para que sea simetrico
				return false;
			}
		}

	return true;

}
	
	
	public String toString() {
		String s=" ";
		s+=Frase.toString()+"\n";
		s+="¿Es palindroma? "+ esPalindroma();
		return s;
	}
}


//Crea una clase que reciba una Frase y sea capaz de evaluar si la Frase el palíndroma o no es palíndroma. 
//Utiliza un ArrayList<Character> para implementar el ejercicio.