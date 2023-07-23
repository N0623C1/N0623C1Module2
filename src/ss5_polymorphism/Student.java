package ss5_polymorphism;

import java.util.Objects;

// Student is-a Person
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

    @Override
    public String toString() {
        return String.format("%s - %s - %s", this.getId(), this.getName(), this.getScore());
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Double.compare(student.getId(), this.getId()) == 0;
//    }
}
