public class fakultatIterativ {

	public static void main ( String[] args ){

		int n = 10;
		int ruckgabe;
		
		fakultatIterativ test = new fakultatIterativ();
		
		ruckgabe = test.fakIterativ(n);
		System.out.println((int)ruckgabe);
	}
	
	public int fakIterativ ( int x ) {
		
			int fakultat = 1;
			int faktor = 2;
		
			while ( faktor <= x ) {
			
				fakultat = fakultat * faktor;
				faktor++;
			}
			return fakultat;
	}
}