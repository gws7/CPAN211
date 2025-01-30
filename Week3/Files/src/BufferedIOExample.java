import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedIOExample {
    public static void main(String[] args) {
        String sourceFile = "source.txt";      // Path to the source file
        String destinationFile = "destination.txt"; // Path to the destination file

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;

            // Read and write line by line
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // Add a newline
            }

            System.out.println("Buffered file copy completed successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred during file operations.");
            e.printStackTrace();
        }
    }
}
