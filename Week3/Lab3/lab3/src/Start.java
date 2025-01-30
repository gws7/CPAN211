import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Start {
    public static void main(String[] args) {
        //Creates two lists for object student and one for professor, respectively
        List<Student> studentList = new ArrayList<>();
        List<Professor> professorList = new ArrayList<>();
        
        //Source File
        String sourceFile = "people.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" "); 
                
                String title = words[0];
                String name = words[1] + " " + words[2]; // Combines name1 and name2
                String type = words[3];
                
                if (title.equalsIgnoreCase("professor")) {
                    professorList.add(new Professor(title, name, type));
                } else if (title.equalsIgnoreCase("student")) {
                    studentList.add(new Student(title, name, type));
                } 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Professor professor : professorList) {
            System.out.println(professor);
        }

        for (Student student : studentList) {
            System.out.println(student);   
        }

        System.out.println("======================");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("professor.ser"))) {
            out.writeObject(professorList);
            System.out.println("Product list has been serialized to professor.ser");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            out.writeObject(studentList);
            System.out.println("Product list has been serialized to student.ser");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("professor.ser"))) {
            List<Professor> deserializedProfessorList = (List<Professor>) in.readObject();
            System.out.println("Deserialized Professor List:");
            for (Professor professor : deserializedProfessorList) {
                System.out.println(professor);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            List<Student> deserializedStudentList = (List<Student>) in.readObject();
            System.out.println("Deserialized Student List:");
            for (Student student : deserializedStudentList) {
                System.out.println(student);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }        
}
