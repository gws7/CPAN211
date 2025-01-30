import java.io.Serializable;

public class Professor implements Serializable{
    private String title;
    private String name;
    private String department;

    Professor(String title, String name, String department){
        this.title = title;
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    } public void setName(String name) {
        this.name = name;
    }

    public String getdepartment() {
        return department;
    } public void setdepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    } public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Professor{title='" + title + "', name='" + name + "', department=" + department + "}";
    }
}
