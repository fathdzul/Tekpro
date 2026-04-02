package JavaProblems;

public class Student {

    private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // id getter
    public int getId() {
        return id;
    }

    // name getter
    public String getName() {
        return name;
    }

    // metode menampilkan informasi student
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}