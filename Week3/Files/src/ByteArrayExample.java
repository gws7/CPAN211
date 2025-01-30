import java.io.*;

public class ByteArrayExample {
    public static void main(String[] args) {
        byte[] data = new byte[] { 65, 66, 67, 68, 69 };  // Represents "ABCDE"
        
        // Output file
        try (FileOutputStream outputStream = new FileOutputStream("output.txt")) {

            // Write the full byte array to the output file
            outputStream.write(data);
            System.out.println("Data written: " + new String(data));

            // Write a portion of the byte array starting from index 1 (second byte) with length 3 (B, C, D)
            outputStream.write(data, 1, 3);
            System.out.println("Partial data written: " + new String(data, 1, 3));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

