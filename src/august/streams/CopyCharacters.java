package august.streams;

import java.io.*;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader in = null;
        FileWriter out = null;

        try {
            in  = new FileReader("source.txt");
            out = new FileWriter("destination.txt");

//            System.out.println("Total bytes available: " + in.read());


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

