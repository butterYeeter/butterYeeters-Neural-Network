import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Input {
    public static void main(String args[])  {
        BufferedImage img = null;
        File input = new File("C:\\Users\\Raaid\\Desktop\\test.png");
        File out = new File("C:\\Users\\Raaid\\Desktop\\out.csv");
        BufferedWriter writer = null;

        try {
            img = ImageIO.read(input);
            BufferedImage test = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
            writer = new BufferedWriter(new FileWriter(out));

            for(int i = 0; i < img.getWidth(); i++){
                for(int j = 0; j < img.getHeight(); j++) {
                    Color c = new Color(img.getRGB(i, j));
                    int a = c.getAlpha();
                    int r = c.getRed();
                    int g = c.getGreen();
                    int b = c.getBlue();

                    Color c2 = new Color(r, g, b, a);
                    writer.write(r + ",");

                    test.setRGB(i, j, c2.getRGB());
                }
            }
            ImageIO.write(test, "png", new File("C:\\Users\\Raaid\\Desktop\\out.png"));
            writer.close();
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}