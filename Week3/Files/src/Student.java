import java.io.FileWriter;
import java.io.IOException;

public class Student {
    public static void main(String[] args) {
        String fileName = "Example.txt";
        //If the file is inside the try() block, it will open, write and close the file thus keeping your changes.
        try (FileWriter writer = new FileWriter(fileName)) {
            //If you were to put the file write in here instead, it will open it but not close it and thus you will not see your changes.
            writer.write("This is a sample text written to the file. \n");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {

        }       
    }
}
