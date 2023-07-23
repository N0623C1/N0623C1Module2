package ss3_static;

public class Student {
    private int id; // Định danh duy nhất => Không được phép thay đổi
    private String name;
    static String className = "N0623C1";

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
