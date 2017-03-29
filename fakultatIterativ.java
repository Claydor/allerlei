public class fakultatIterativ {

	public static void main ( String[] args ){

		int n = 20;
		int ruckgabe;
		long startZeit;
		long endZeit;
		
		fakultatIterativ test = new fakultatIterativ();
		fakultatIterativ zeit = new fakultatIterativ();
		
		startZeit = zeit.getTime();
		ruckgabe = test.fakIterativ(n);
		endZeit = zeit.getTime();
		System.out.println("Die Fakultät von " + (int)n + " ist " + (int)ruckgabe + ".\nDie Berechnung hat " + (endZeit - startZeit) + " ms gedauert (Startzeit = " + startZeit + ", Endzeit = " + endZeit + ").\n");
	}
	
	public long getTime() {
		
		return System.currentTimeMillis();
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