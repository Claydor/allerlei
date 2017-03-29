import java.util.*;


public class pwGenerator {
	
	public static void main (String[] args) {
		
		String stelle1;
		String stelle2;
		String stelle3;
		String stelle4;
		String stelle5;
		int grenze1 = 97;
		int grenze2 = 122;
		int count = 0;
		String eingabe;
		String erwartet = "y";
		
		Scanner scan = new Scanner(System.in);		
		
		
		for ( int i = 0; i < 24; i++) { System.out.print("\n"); }
		
		System.out.println("-------- Willkommen beim Passwortgenerator --------");
		System.out.println("Sollen ihre Möglichkeiten ausgegeben werden? (y/n)");
		
		eingabe = scan.next();
		//System.out.println(eingabe);
		
		if ( eingabe.equals(erwartet) ) {
		
			for ( int i = grenze1; i <= grenze2; i++) {
				
				stelle1 = Character.toString((char) i);
				
				for ( int k = grenze1; k <= grenze2; k++) {
					
					stelle2 = Character.toString((char) k);
				
					for ( int j = grenze1; j <= grenze2; j++) {
						
						stelle3 = Character.toString((char) j);
						
						for ( int l = grenze1; l <= grenze2; l++) {
							
							stelle4 = Character.toString((char) l);
							
							//for ( int m = grenze1; m <= grenze2; m++) {
									
								//stelle5 = Character.toString((char) m);
								
								System.out.print(count + " " + stelle1 + stelle2 + stelle3 + stelle4 + "\t");
								
								if (count % 11 == 0) { System.out.print("\n"); }
								count++;
							//}
						}
					}
				}
			}
			System.out.println("\n Sie haben " + count + " Möglichkeiten");
		}
		else if ( eingabe.equals("n") ) {
			
			System.out.println("Vorgang abgebrochen");
		}
		else {
			
			System.out.println("Ungültige Eingabe");
		}
	}
}