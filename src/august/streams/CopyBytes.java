package august.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in  = new FileInputStream("xyz.txt");
            out = new FileOutputStream("abc.txt");

            System.out.println("Total bytes available: " + in.available());


            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            System.out.println("The process is completed");
        } catch (FileNotFoundException fe) {
            System.out.println("Sorry, the source file is not found!");
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
