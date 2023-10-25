package example2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Example2 {
    // PrintWriter PrintStream
    public static void main(String[] args) {
        try {
            FileOutputStream outputStream = new FileOutputStream("text_file.txt");
            PrintWriter out = new PrintWriter(outputStream);
            out.println("HELLO, WORLD");
            out.print(2.5f);
            out.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
