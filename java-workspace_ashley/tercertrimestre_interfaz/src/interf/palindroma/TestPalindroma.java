package interf.palindroma;

public class TestPalindroma  {

	public static void main(String[] args) {
		
		Palindroma p1 = new Palindroma ();
		
		p1.addPalindroma('r');
		p1.addPalindroma('e');
		p1.addPalindroma('c');
		p1.addPalindroma('o');
		p1.addPalindroma('n');
		p1.addPalindroma('o');
		p1.addPalindroma('c');
		p1.addPalindroma('e');
		p1.addPalindroma('r');

		
		System.out.println(p1.toString()+"\n");
		
		Palindroma p2 = new Palindroma ();
		
		p2.addPalindroma('l');
		p2.addPalindroma('u');
		p2.addPalindroma('z');
		p2.addPalindroma('a');
		p2.addPalindroma('z');
		p2.addPalindroma('u');
		p2.addPalindroma('l');

		
		System.out.println(p2.toString()+"\n");
		
		Palindroma p3 = new Palindroma ();
		
		p3.addPalindroma('r');
		p3.addPalindroma('e');
		p3.addPalindroma('c');
		p3.addPalindroma('o');
		p3.addPalindroma('r');
		p3.addPalindroma('d');


		
		System.out.println(p3.toString()+"\n");

	}

}
