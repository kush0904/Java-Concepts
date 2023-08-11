package august.fileHandling;

import java.io.*;

public class CopyBuffers {
    public static void main(String[] args) throws IOException {

        BufferedReader bReader = null;
        BufferedWriter bWriter = null;

        try {
            bReader  = new BufferedReader(new FileReader("bufferSource.txt"));
            bWriter = new BufferedWriter(new FileWriter("bufferDestination.txt"));



            String line;
            while ((line = bReader.readLine()) != null) {
                bWriter.write(line);
            }

            System.out.println("The process is completed");
        } catch (IOException e) {
            System.out.println("Sorry, the source file is not found!");
        } finally {
            if (bReader != null) {
                bReader.close();
            }
            if (bWriter != null) {
                bWriter.close();
            }
        }
    }
}
