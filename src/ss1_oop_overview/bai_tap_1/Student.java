package ss1_oop_overview.bai_tap_1;

import java.util.Scanner;

public class Student {
    String name;
    int age;
    String color;

    void toEat() {
        System.out.println(name + " ăn nhiều");
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tên: ");
        name = scanner.nextLine();

        System.out.print("Nhập vào tuổi: ");
        age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào màu yêu thích: ");
        color = scanner.nextLine();
    }

    void output() {
        System.out.println("Tên: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }
}
