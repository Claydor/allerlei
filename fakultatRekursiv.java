public class fakultatRekursiv {

	public static void main ( String[] args ) {

		int n = 6;
		int ausgabe;

		fakultatRekursiv test = new fakultatRekursiv();

		ausgabe = test.rekursion(n);
		System.out.println("Die Fakultät von " + (int)n + " ist " + (int)ausgabe + ".");
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