import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class GetPixels {
    
    public static void main(String[] args) {
        String path = "C:\\Users\\12213119\\Documents\\Projects\\Cookbook_Java\\images\\resources\\";

        try {
            // CREATE FILE
            FileWriter writer = new FileWriter(path+"pixels.txt");

        //Reading the image
        File file= new File(path + "smiley.jpg");
        BufferedImage img = ImageIO.read(file);
        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                
                //GET PIXEL RGB
                int pixel = img.getRGB(x,y);
                
                // SET COLOR
                Color color = new Color(pixel, true);

                // GET RGB
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();

                // WRITE RGB TO FILE
                writer.append(red+":");
                writer.append(green+":");
                writer.append(blue+"");
                writer.append(" ");
                writer.flush();
            }
        }
        writer.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
   

    }

}