import java.io.File;
import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class pixelwerte {

	public static void main ( String[] args ) {

		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("Bild.jpg"));
		} catch (IOException e) {}


		int imageWidth = img.getWidth();
		int imageHeight = img.getHeight();
		
		int color;
		int[][][] farbwerte = new int[imageWidth] [imageHeight] [3];

		for (int x = 0; x < imageWidth; x++) {
			for (int y = 0; y < imageHeight; y++) {
				color = img.getRGB(x,y);
				
				farbwerte[x][y][0] = (color & 0xff); //Blauwert
				farbwerte[x][y][1] = (color & 0xff00) >> 8; //Grünwert
				farbwerte[x][y][2] = (color & 0xff0000) >> 16; //Rotwerte
			}
		}

		for (int x = 0; x < imageWidth; x++) {
			for (int y = 0; y < imageHeight; y++) {
				for (int c = 0; c <= 2; c++) {
					if (c == 0) {System.out.print(x + ":" + y + "b" + " " + farbwerte[x][y][c] + "\t");}
					if (c == 1) {System.out.print(x + ":" + y + "g" + " " + farbwerte[x][y][c] + "\t");}
					if (c == 2) {System.out.print(x + ":" + y + "r" + " " + farbwerte[x][y][c] + "\t");}
				}
			}
			System.out.print("\n\n");
		}

		try (FileWriter writer = new FileWriter("pixelWerte.txt")) {
			for (int x = 0; x < imageWidth; x++) {
				for (int y = 0; y < imageHeight; y++) {
					for (int c = 0; c <= 2; c++) {
						writer.write(farbwerte[x][y][c] + "\t");
					}
				}
				writer.write("\n");
			}
		}
		catch (IOException e){}
		//finally {
			//if (writer != null) {
				//writer.close();
			//}
		//}
	}
}