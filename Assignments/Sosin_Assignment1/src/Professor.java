// Gabriel Sosin

public class Professor extends Person {

    Professor(String firstName, String lastName, String title, String department){
        super(firstName, lastName, title, department);
    }

    @Override
    public int getParticipatingHours(int courseHours) {
        int labHours = (courseHours > 4) ? 2 : 1;
        return courseHours - labHours;
    }
}
