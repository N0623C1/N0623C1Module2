package ss2_constructor;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student();
//
//        student.id = 1;
//        student.name = "abc";
//        student.score = 10;

        Student student = new Student(1, "abc", 10);

        double score = 1;
        student.setScore(score); // Điểm của việt nam: [0-10]
        System.out.println("Điểm: " + student.getScore());
        System.out.println("Id: " + student.getId());
        System.out.println("score => " + score);
//        student.setId(10);

        /*
        Vì sao không để thuộc tính là public

        mà phải là private + get/set
         */

        Integer n = 2;
        changeData(n);

        System.out.println(n);
    }

    public static void changeData(Integer n) {
        n = 100;
    }
}
