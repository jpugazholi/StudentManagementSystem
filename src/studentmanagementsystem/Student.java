package studentmanagementsystem;

public class Student {
    private String id;
    private String name;
    private String department;
    private String year;

    public Student(String id, String name,
                   String department, String year) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setYear(String year) {
        this.year = year;
    }
}