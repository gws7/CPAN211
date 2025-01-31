// Gabriel Sosin

public class TA extends Person {

    TA(String firstName, String lastName, String title, String department){
        super(firstName, lastName, title, department);
    }

    @Override
    public int getParticipatingHours(int courseHours) {
        return (courseHours > 4) ? 2 : 1;
    }
}
