import java.awt.Color;
import java.awt.image.BufferedImage;

public class pixelwerte {
	
	public static void main ( String[] args ) throws Exception {
		
		int rgb;
		Color c = new Color(rgb);
		
		BufferedImage img = ImageIO.read( new File("/home/nwboxuser/Dokumente/allerlei/bild.jpg") );
       
		int imageWidth = image.getWidth(pixelwerte);
		int imageHeight =  image.getHeight(pixelwerte);
		
		int[][] farbwerte  = new int[imageWidth] [imageHeight];
		
		for ( int x = 0; x < imageWidth; x++ ) {
		
			for ( int y = 0; x < imageHeight; y++ ) {
			
					
			}
		}
        rgb = img.getRGB(100, 50);
	}
}