import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteFile {
    public static void main(String[] args) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String now = timeFormat.format(new Date());    
    
        String root = "C:\\Users\\12213119\\Documents\\Projects\\Cookbook_Java\\files\\files\\";
        String fileName = "_file";
        String fileType = ".txt";
        String fileContent = "Hello World!";
        String filePath = root +now +fileName + fileType;



        try {
            // CREATE FILE
            FileWriter fileWriter = new FileWriter(filePath);



            // WRITE CONTENT TO FILE
            for (int i = 0; i < fileContent.length(); i++)
            fileWriter.write(fileContent.charAt(i));



            // CLOSE FILE
            fileWriter.close();



        } catch (Exception e) {
            e.getStackTrace();
        }



    }
}