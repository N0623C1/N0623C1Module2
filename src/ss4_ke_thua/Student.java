package ss4_ke_thua;

public class Student extends Person {
    private double score;

    public Student() {
    }

    public Student(int id, String name, double score) {
        super(id, name);
        this.score = score;
    }
//
//    @Override // thích thì vào
//    public void run() {
//        System.out.println("Student run");
//    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
