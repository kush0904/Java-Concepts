package august.streams;

import java.io.*;

public class DataStream {
    public static void main(String[] args) throws IOException {

        DataOutputStream out = null;
        DataInputStream in = null;

        /* Output to file */
        try {
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("dataSource.txt")));

            final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
            final int[] units = { 12, 8, 13, 29, 50 };
            final String[] descs = {
                    "Java T-shirt",
                    "Java Mug",
                    "Duke Juggling Dolls",
                    "Java Pin",
                    "Java Key Chain"
            };

            for (int i = 0; i < prices.length; i++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }

            out.close();

            /* Input from file */
            in = new DataInputStream(new BufferedInputStream(new FileInputStream("dataSource.txt")));

            System.out.println("Process Completed");
            double total = 0;
            while (in.available()>0) {
                double price = in.readDouble();
                int unit = in.readInt();
                String desc = in.readUTF();
                System.out.format("You ordered %d units of %s at $%.2f%n", unit, desc, price);
                total += unit * price;
            }

            System.out.format("Total cost: $%.2f%n", total);

        } catch (EOFException e) {
            System.out.println("Reached end of file.");
        } finally {
            if (out != null) {
                out.close();
            }
            if (in != null) {
                in.close();
            }
        }
    }
}
