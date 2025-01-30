import java.io.Serializable;

public class Student implements Serializable{
    private String title;
    private String name;
    private String degree;

    Student(String title, String name, String degree){
        this.title = title;
        this.name = name;
        this.degree = degree;
    }

    public String getName() {
        return name;
    } public void setName(String name) {
        this.name = name;
    }

    public String getdegree() {
        return degree;
    } public void setdegree(String degree) {
        this.degree = degree;
    }

    public String getTitle() {
        return title;
    } public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Student{title='" + title + "', name='" + name + "', degree=" + degree + "}";
    }
}
