import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {
    public static void main(String[] args) {
        String fileName = "datafile.dat";

        // Writing data to the file using DataOutputStream
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(fileName))) {
            // Writing primitive data types
            dataOut.writeInt(100);      // Writes an int
            dataOut.writeFloat(98.6f);  // Writes a float
            dataOut.writeDouble(3.14159); // Writes a double
            dataOut.writeUTF("Hello, World!"); // Writes a String

            System.out.println("Data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading data from the file using DataInputStream
        try (DataInputStream dataIn = new DataInputStream(new FileInputStream(fileName))) {
            // Reading data in the same order they were written
            int intValue = dataIn.readInt();      // Reads an int
            float floatValue = dataIn.readFloat();  // Reads a float
            double doubleValue = dataIn.readDouble(); // Reads a double
            String stringValue = dataIn.readUTF(); // Reads a String

            // Output the read data
            System.out.println("Data read from file:");
            System.out.println("Read int: " + intValue);
            System.out.println("Read float: " + floatValue);
            System.out.println("Read double: " + doubleValue);
            System.out.println("Read String: " + stringValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

