package EungYong6;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.IOException;

public class Main6_q1 {
    public static void main(String[] args) {
        String inputFile = "/Users/DA/Desktop/java.txt";
        String outputFile = "/Users/DA/Desktop/newJAVA.txt.gz";
        try {
            FileInputStream fis = new FileInputStream(inputFile);
            BufferedInputStream bis = new BufferedInputStream(fis);

            FileOutputStream fos = new FileOutputStream(outputFile);
            GZIPOutputStream gzos = new GZIPOutputStream(fos);
            byte[] byteBuff = new byte[9999];

            int data;
            while ((data = bis.read(byteBuff)) != -1) {
                gzos.write(byteBuff, 0, data);
            }
            bis.close();
            gzos.finish();
            gzos.close();

            System.out.println("파일이 압축되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}