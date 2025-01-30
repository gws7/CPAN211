import java.io.*;

public class All_CompleteFileCopyExample {
    public static void main(String[] args) {
        String sourceFile = "source.txt";  // Path to the source file
        String destinationFile = "destination.txt"; // Path to the destination file

        try (
            // Step 1: Using byte streams to copy binary data
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationFile);
            
            // Step 2: Using character streams to copy text data
            FileReader fileReader = new FileReader(sourceFile);
            FileWriter fileWriter = new FileWriter(destinationFile);
            
            // Step 3: Using buffered streams for efficient copying
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            // Using byte streams for binary data
            System.out.println("Using Byte Streams:");
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            // Using character streams for text data
            System.out.println("Using Character Streams:");
            int charData;
            while ((charData = fileReader.read()) != -1) {
                fileWriter.write(charData);
            }

            // Using buffered streams for efficient reading/writing
            System.out.println("Using Buffered Streams:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            System.out.println("File copied successfully using different I/O streams!");

        } catch (IOException e) {
            System.out.println("An error occurred during file operations.");
            e.printStackTrace();
        }
    }
}

