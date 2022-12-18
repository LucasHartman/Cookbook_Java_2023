import java.io.File;
import java.io.FileWriter;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.image.BufferedImage;


public class PixelsToCsv{
    

    public static void main(String[] args) {
        String path = "C:\\Users\\12213119\\Documents\\Projects\\Cookbook_Java\\images\\resources\\";

        try {
        // WRITE FILE
        File csvFile = new File(path+ "pixels.csv");
        FileWriter writer = new FileWriter(csvFile);

        // GET IMAGE
        File file= new File(path + "smiley.jpg");

        // READ IMAGE
        BufferedImage img = ImageIO.read(file);
        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                
                //GET PIXEL RGB
                int pixel = img.getRGB(x,y);
                
                // SET COLOR
                Color color = new Color(pixel, true);

                // GET RGB
                int r = color.getRed();
                int g = color.getGreen();
                int b = color.getBlue();

                // BUILD STRING
                StringBuilder line = new StringBuilder();
                line.append("{");
                line.append(x +", ");
                line.append(y +", ");
                line.append(r +", ");
                line.append(g +", ");
                line.append(b);
                line.append("},");
                line.append("\n");

                writer.flush();

                // WRITE STRING TO CVS
                writer.write(line.toString());
            }
        }
            writer.close();

        } catch (Exception e) {
            e.getStackTrace();
        }

    }
    
    

}