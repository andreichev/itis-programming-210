package example3;

import java.io.*;

public class Example3 {
    public static void main(String[] args) {
        boolean write = false;
        if (write) {
            try {
                OutputStream outputStream = new FileOutputStream("example3.txt");
                DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
                dataOutputStream.writeFloat(3.5f);
                dataOutputStream.writeFloat(13.5f);
                dataOutputStream.writeFloat(15.2f);
                dataOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                InputStream inputStream = new FileInputStream("example3.txt");
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                System.out.println(dataInputStream.readFloat());
                System.out.println(dataInputStream.readFloat());
                System.out.println(dataInputStream.readFloat());
                dataInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
