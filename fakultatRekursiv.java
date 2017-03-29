public class fakultatRekursiv {

	public static void main ( String[] args ) {

		int n = 20;
		int ausgabe;
		long startZeit;
		long endZeit;

		fakultatRekursiv test = new fakultatRekursiv();
		fakultatIterativ zeit = new fakultatIterativ();


		startZeit = zeit.getTime();
		ausgabe = test.rekursion(n);
		endZeit = zeit.getTime();
		System.out.println("Die Fakultät von " + (int)n + " ist " + (int)ausgabe + ".\nDie Berechnung hat " + (endZeit - startZeit) + " ms gedauert (Startzeit = " + startZeit + ", Endzeit = " + endZeit + ").\n");
	}
	
	public long getTime() {
		
			return System.currentTimeMillis();
	}
	
	public int rekursion (int x) {

		if ( x <= 1) {

			return 1;
		}
		else {

			return ( x * rekursion( x - 1 ));
		}
	}
	
}