package ss3_static;

import ss3_static.util.InputUtil;

import java.util.ArrayList;

public class Main {
    static boolean isStatic; // biến static
    boolean isNonStatic; // biến toàn cục => biến của đối tượng
    static ArrayList<Integer> integers;

    static {
//        isStatic = true; // Khởi tạo giá trị ban đầu
        integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);
    }

    public static void main(String[] args) {
        int a = 2;

        System.out.println(isStatic);
//        Main main = new Main();
//        main.isNonStatic = false;


//        Student s1 = new Student(1, "Nguyễn Văn A");
//        Student s2 = new Student(2, "Nguyễn Văn B");
//
//        System.out.println("s1.name: " + s1.getName());
//        System.out.println("s2.name: " + s2.getName());
//
//        Student.className = "XXX";
//
//        System.out.println("className: " + s1.className);
//        System.out.println("className: " + s2.className);

//        int x;
//        System.out.println(x);
    }
}
