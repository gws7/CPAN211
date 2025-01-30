import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) {
        String sourceFile = "source.txt";      // Path to the source file
        String destinationFile = "destination.txt"; // Path to the destination file

        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(destinationFile)) {

            int charData;

            // Read and write character by character
            while ((charData = reader.read()) != -1) {
                writer.write(charData);
            }

            System.out.println("Text file copied successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred during file operations.");
            e.printStackTrace();
        }
    }
}
