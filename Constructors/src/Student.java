public class Student {
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getClasses() {
        return Classes;
    }

    public void setClasses(String classes) {
        Classes = classes;
    }

    private int Id;
    private String Name;
    private String Classes;

    public Student(int id, String name, String classes) {
        Id = id;
        Name = name;
        Classes = classes;
    }

    public Student() {
    }
}
