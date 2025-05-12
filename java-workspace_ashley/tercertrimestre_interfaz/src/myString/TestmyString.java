package myString;

import java.util.ArrayList;

public class TestmyString {

	public static void main(String[] args) {

		ArrayList <Character> s1 = new ArrayList <Character> ();

		s1.add('P');
		s1.add('e');
		s1.add('r');
		s1.add('r');
		s1.add('o');
		s1.add(' ');
		s1.add('P');
		s1.add('l');
		s1.add('u');
		s1.add('t');
		s1.add('o');


		String s2 = new String ("Vaca Lola");

		char [] s3 = {'R','a','t','o','n', ' ', 'M','i','c','k','e','y'};

		String s4 = new String ("manzana,pera,plátano");

		MyString ms1 = new MyString (s1);
		MyString ms2 = new MyString (s2);
		MyString ms3 = new MyString (s3);
		MyString ms4 = new MyString (s4);


		System.out.println(ms1.getCadena());
		System.out.println();

		//myChartAt
		try {
			System.out.println(ms1.myCharAt(98));//da la letra en la posicion que pude (los espacios no cuentan)
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println();

		try {
			System.out.println(ms1.myCharAt(7));//da la letra en la posicion que pude (los espacios no cuentan)
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println();
		//compareTo
		try {
			System.out.println(ms2.myCompareTo(ms1));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println();

		System.out.println(ms1.myCompareToIgnoreCase(ms3));
		System.out.println();

		//Concat
		System.out.println(ms1.myConcat(ms3));
		System.out.println();


		System.out.println(ms2.myIndexOf('p'));
		System.out.println();

		System.out.println(ms2.myLastIndexOf('a'));
		System.out.println();


		System.out.println(ms3.myLength());
		System.out.println();
		System.out.println(ms3.myReplace('M', 'P'));
		System.out.println();
		
		
		MyString[] frutas = ms4.mySplit(',');
		for (MyString fruta : frutas) {
		    System.out.println(fruta);
		}

		System.out.println();
		//Substring
		try {
			System.out.println(ms2.mySubstring(2, 7));
		} catch (Exception e) {
			e.getMessage();
		}
		System.out.println();
		System.out.println(ms2.myToLowerCase());
		System.out.println();
		System.out.println(ms1.myToUpperCase());
		System.out.println();
		ms2.imprimir();
		System.out.println();
		System.out.println(ms3.toString());
		System.out.println();


	}
}
