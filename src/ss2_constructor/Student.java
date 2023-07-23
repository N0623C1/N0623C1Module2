package ss2_constructor;

public class Student {
    private int id; // Định danh duy nhất => Không được phép thay đổi
    private String name;
    private double score;

    public Student() {

    }

    public Student(int id) {
        this(); // Gọi lại constructor => phải dòng đầu tiên
        this.id = id;
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public void setScore(double score) { // 5
        if(score < 0 || score > 10) {
            System.out.println("Điểm không lệ");
            // throw/throws
        } else {
            this.score = score;
        }
    }

    public double getScore() {
        return score;
    }

    /*
    Tùy chỉnh việc đọc ghi
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
