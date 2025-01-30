import java.io.*;

public class SimpleFileIO {
    public static void main(String[] args) {
             File inputFile = new File("input.txt");
        // Debug: Print the absolute path of the file
        System.out.println("Looking for file at: " + inputFile.getAbsolutePath());
        ///-----------------------------------------------
        // Step 1: Opening the file for reading and writing
        // Here, we are opening 'input.txt' to read and 'output.txt' to write
        try (FileInputStream inputStream = new FileInputStream("input.txt");
             FileOutputStream outputStream = new FileOutputStream("output.txt")) {

            // The 'try-with-resources' automatically closes the streams when done

            System.out.println("Files opened successfully.");

            // Step 2: Reading from the input file and writing to the output file
            int byteData; // Variable to hold data read from the input file
            while ((byteData = inputStream.read()) != -1) { // Loop until end of file is reached
                outputStream.write(byteData); // Write each byte read to the output file
            }

            System.out.println("Content copied successfully from input.txt to output.txt.");

        } catch (FileNotFoundException e) {
            // This block catches if the file does not exist
            System.out.println("File not found. Please check the file path.");
        } catch (IOException e) {
            // This block catches any other I/O errors
            System.out.println("An error occurred while processing the file: " + e.getMessage());
        }

        // Step 3: Files are automatically closed at the end of the 'try-with-resources' block
    }
}
