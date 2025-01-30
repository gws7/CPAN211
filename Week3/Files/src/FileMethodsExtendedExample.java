import java.io.File;
import java.io.IOException;

public class FileMethodsExtendedExample {
    public static void main(String[] args) {
        // Create a File object representing a file with relative path
        File file = new File("input.txt");

        // Check if the file or directory exists
        if (file.exists()) {
            System.out.println("File/Directory exists.");
        } else {
            System.out.println("File/Directory does not exist.");
        }

        // Get the length of the file (in bytes)
        if (file.exists()) {
            long fileLength = file.length();
            System.out.println("File length: " + fileLength + " bytes.");
        } else {
            System.out.println("Cannot determine file length because the file doesn't exist.");
        }

        // Check if it's a directory
        if (file.isDirectory()) {
            System.out.println("This is a directory.");
        } else {
            System.out.println("This is not a directory.");
        }

        // Check if it's a file
        if (file.isFile()) {
            System.out.println("This is a file.");
        } else {
            System.out.println("This is not a file.");
        }

        // Check if the file is readable
        if (file.canRead()) {
            System.out.println("This file is readable.");
        } else {
            System.out.println("This file is not readable.");
        }

        // Check if the file is writable
        if (file.canWrite()) {
            System.out.println("This file is writable.");
        } else {
            System.out.println("This file is not writable.");
        }

        // Rename the file
        File renamedFile = new File("renamed_input.txt");
        if (file.exists()) {
            boolean renamed = file.renameTo(renamedFile);
            if (renamed) {
                System.out.println("File renamed to 'renamed_input.txt'.");
            } else {
                System.out.println("Failed to rename the file.");
            }
        }

        // Create a new directory
        File dir = new File("newDirectory");
        if (!dir.exists()) {
            boolean dirCreated = dir.mkdir(); // Creates the directory
            if (dirCreated) {
                System.out.println("Directory 'newDirectory' created successfully.");
            } else {
                System.out.println("Failed to create directory 'newDirectory'.");
            }
        } else {
            System.out.println("Directory 'newDirectory' already exists.");
        }

        // Delete the renamed file
        if (renamedFile.exists()) {
            boolean deleted = renamedFile.delete();
            if (deleted) {
                System.out.println("File 'renamed_input.txt' deleted successfully.");
            } else {
                System.out.println("Failed to delete 'renamed_input.txt'.");
            }
        }

        // Delete a directory (only if it's empty)
        if (dir.exists()) {
            boolean dirDeleted = dir.delete();
            if (dirDeleted) {
                System.out.println("Directory 'newDirectory' deleted successfully.");
            } else {
                System.out.println("Failed to delete directory 'newDirectory'. It might not be empty.");
            }
        }

        // Delete the file on program exit
        File tempFile = new File("tempFileToDelete.txt");
        try {
            if (tempFile.createNewFile()) {
                System.out.println("Temporary file 'tempFileToDelete.txt' created.");
                tempFile.deleteOnExit();  // Will delete the file when the program terminates
                System.out.println("Temporary file will be deleted upon program exit.");
            } else {
                System.out.println("Failed to create temporary file.");
            }
        } catch (IOException e) {
            System.out.println("IOException occurred while creating the temporary file: " + e.getMessage());
        }
    }
}
