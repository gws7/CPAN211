import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Start {
    public static void main(String[] args) {
        String sourceFile = "peopleList.txt";

        Person[] people = new Person[50];
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile))){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");

                if (words[0].equals("end")) { 
                    break; 
                }

                String title = words[0];
                String firstName = words[1]; 
                String lastName = words[2];
                String department = words[3];
                int hours = Integer.parseInt(words[4]);
                //Person person is null because the code will check if that person exists, if it remains null it means the person doesnt exist so its created and put in the array
                Person person = null;

                //This only runs if there are people inside the array Person
                for (int i = 0; i < count; i++) {
                    //If information of the person matches that means they must already exist, so the information is assigned in the array and the loop breaks
                    //It checks if its not null first and then checks for equality.
                    if (people[i] != null &&
                        people[i].firstName != null &&
                        people[i].lastName != null &&
                        people[i].title != null &&
                        people[i].firstName.equals(firstName) &&
                        people[i].lastName.equals(lastName) &&
                        people[i].title.equals(title)) {
                        person = people[i];
                        break;
                    }
                }

                if(person == null) {
                    if (title.equalsIgnoreCase("Professor")) {
                        person = new Professor(firstName, lastName, title, department);
                    } else if (title.equalsIgnoreCase("TA")) {
                        person = new TA(firstName, lastName, title, department);
                    } else {
                        person = new Student(firstName, lastName, title, department);
                    }
                    //Adds the person to the array and increments the count, which in turns allows for the duplicate people check to work since now count > 1
                    people[count++] = person; 
                }

                //For the person recently created you run addHours in order to put in their hours with the getParticipatingHours(hours) method 
                person.addHours(person.getParticipatingHours(hours));
            }

            for (int i = 0; i < count; i++) {
                System.out.println(people[i]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
