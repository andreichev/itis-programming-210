package example1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example1 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
        fileOutputStream.write(100);
        fileOutputStream.write(100);
        fileOutputStream.write(100);
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("file.txt");
        System.out.println(fileInputStream.read());
        System.out.println(fileInputStream.read());
        System.out.println(fileInputStream.read());
        System.out.println(fileInputStream.read());
        fileInputStream.close();
    }
}