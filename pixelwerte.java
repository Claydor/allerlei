import java.io.File;
import java.awt.Color;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class pixelwerte {

	public static void main ( String[] args ) {

		/*
		int rgb;
		Color c = new Color(rgb);
		*/

		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("Bild.jpg"));
		} catch (IOException e) {}


		int imageWidth = img.getWidth();
		int imageHeight = img.getHeight();

		int[][] farbwerte = new int[imageWidth] [imageHeight];

		for (int x = 0; x < imageWidth; x++) {
			for (int y = 0; y < imageHeight; y++) {
				farbwerte[x][y] = img.getRGB(x,y);
			}
		}

		for (int x = 0; x < imageWidth; x++) {
			for (int y = 0; y < imageHeight; y++) {
				if (x == 0 && y == 0) {
					System.out.println("\n");
				}
				System.out.print(x + ":" + y + " " + farbwerte[x][y] + "\t");
			}
			System.out.print("\n");
		}
	}
}
