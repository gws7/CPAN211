// Gabriel Sosin

public class Student extends Person {

    Student(String firstName, String lastName, String title, String department){
        super(firstName, lastName, title, department);
    }

    @Override
    public int getParticipatingHours(int courseHours) {
        return courseHours;
    }
}
