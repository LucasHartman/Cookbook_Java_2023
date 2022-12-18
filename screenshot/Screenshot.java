import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshot{
    public static void main(String[] args) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String now = timeFormat.format(new Date());    
        String root = "C:\\Users\\12213119\\Documents\\Projects\\Cookbook_Java\\screenshot\\resources\\";
        String fileName = "_file";
        String fileType = ".jpg";
        String filePath = root +now +fileName + fileType;

        try {
            Thread.sleep(120);
            Robot r 
                = new Robot();
            Rectangle capture = new Rectangle(Toolkit
                .getDefaultToolkit()
                .getScreenSize());
            BufferedImage Image = r
                .createScreenCapture(capture);
            ImageIO
                .write(Image, "jpg", new File(filePath));

        } catch (AWTException | IOException | InterruptedException ex) {
            System.out.println(ex);
        }
        
    }
}