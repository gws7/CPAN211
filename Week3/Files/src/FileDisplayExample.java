/*Byte Streams process data byte by byte and are not line-oriented.
Character Streams handle data as characters, ideal for text files.
Buffered Streams work with larger chunks of data, making them faster and more efficient for large files. */
import java.io.*;

public class FileDisplayExample {
    public static void main(String[] args) {
        String sourceFile = "source.txt"; // Path to the source file

        try (
            // Byte stream objects
            FileInputStream fis = new FileInputStream(sourceFile);

            // Character stream objects
            FileReader fileReader = new FileReader(sourceFile);

            // Buffered stream objects
            BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            // Using byte streams to display binary data as characters
            System.out.println("Using Byte Streams:");
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData); // Cast byte to char to display readable text
            }
            System.out.println("\n"); // Line break for clarity

            // Using character streams to display text data
            System.out.println("Using Character Streams:");
            int charData;
            while ((charData = fileReader.read()) != -1) {
                System.out.print((char) charData);
            }
            System.out.println("\n");

            // Using buffered streams to display text data efficiently
            System.out.println("Using Buffered Streams:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Print each line directly
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

