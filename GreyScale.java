import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class GreyScale {
	public static void main(String[] args)
	{
		File f = new File(JOptionPane.showInputDialog("Enter a file path"));
		
		BufferedImage img = null;
		
		try {
			img = ImageIO.read(f);
			
			BufferedImage grScale = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
			
			for (int i = 0; i < grScale.getWidth(); i++) {
				for(int j = 0; j < grScale.getHeight(); j++) {
					Color c = new Color(img.getRGB(i, j));
					int a = c.getAlpha();
					int r = c.getRed();
					int g = c.getGreen();
					int b = c.getBlue();
					
					
					int gr = (r + g + b) / 3;
					
					Color greyed = new Color(gr, gr, gr, a);
					grScale.setRGB(i, j, greyed.getRGB());
				}
			}
			
			ImageIO.write(grScale, "png", new File("C:\\Users\\Raaid\\Desktop\\out.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}