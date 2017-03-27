public class pwGenerator {

	public static void main (String[] args) {
		
		String stelle1;
		String stelle2;
		int grenze1 = 97;
		int grenze2 = 122;
		int count = 0;
		
		for ( int i = 0; i < 5; i++) { System.out.print("\n"); }
		System.out.println("-------- Alle möglichen Zweistelligen Passwörter (nur Buchstaben) --------");
		System.out.println("Sollen ihre Möglichkeiten ausgegeben werden? (y/n)");
		if ( readLine() == "y") {
		
			for ( int i = grenze1; i <= grenze2; i++) {
				stelle1 = Character.toString((char) i);
				
				for ( int k = grenze1; k <= grenze2; k++) {
					stelle2 = Character.toString((char) k);
					
					System.out.print(count + " " + stelle1 + stelle2 + "\t \t");
					if (count % 4 == 0) { System.out.print("\n"); }
					count++;
				}
			}
			System.out.println("\n Sie haben " + count + " Möglichkeiten");
		}
	}
}