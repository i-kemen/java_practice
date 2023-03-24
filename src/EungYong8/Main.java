package EungYong8;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        String fileURL = "https://alimipro.com/favicon.ico";
        String saveDir = "./";
        String fileName = "icon.ico";

        try

        {
            URL url = new URL(fileURL);
            InputStream inputStream = url.openStream();

            byte[] buffer = new byte[4096];
            int bytesRead = -1;

            FileOutputStream outputStream = new FileOutputStream(saveDir + fileName);

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File downloaded");

            inputStream.close();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
