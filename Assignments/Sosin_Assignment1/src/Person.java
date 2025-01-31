// Gabriel Sosin

public abstract class Person implements ParticipateHours {
    String firstName;
    String lastName;
    String title;
    String department;
    int hours; 

    Person(String firstName, String lastName, String title, String department){
        this.firstName = firstName; 
        this.lastName = lastName;
        this.title = title;
        this.department = department;
        this.hours = 0; 
    }

    public String getFirstName() {
        return firstName;
    } public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    } public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    } public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    } public void setTitle(String title) {
        this.title = title;
    }

    public void addHours(int hours) {
        this.hours += hours;
    }

    @Override
    public String toString() {
        return getClass().getName() + " " + firstName + " " + lastName + " " + hours;
    }

}
