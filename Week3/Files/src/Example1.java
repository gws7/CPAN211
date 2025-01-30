import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        String fileName = "example.txt";
        
        // Writing data to the file using FileWriter
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("This is a sample text written to the file.\n");
            writer.write("FileReader and FileWriter are used for character-based I/O.\n");
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading data from the file using FileReader
        try (FileReader reader = new FileReader(fileName)) {
            int ch;
            System.out.println("\nData read from the file:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);  // Convert int to char and print
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
