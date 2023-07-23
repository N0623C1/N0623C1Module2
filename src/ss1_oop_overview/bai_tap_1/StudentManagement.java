package ss1_oop_overview.bai_tap_1;

import java.util.Arrays;

public class StudentManagement {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        Student s2 = new Student();
//        // s1: biến đối tượng
//        // new Student();: đối tượng
//        // Student: Kiểu dữ liệu
//        s1.input();
//        s2.input();
//
//
//        s1.output();
//        s2.output();

        int n = 2; //số lượng học sinh => scanner nhập vào
        Student[] studentList = new Student[n]; // null null

        for(int i = 0; i < studentList.length; i++) {
            System.out.printf("=== Nhập vào thông tin học sinh thứ %d ===\n", i + 1);
            studentList[i] = new Student();
            studentList[i].input();
        }

        System.out.println("\n\n========== Xuất thông tin ==========\n\n");
        for(int i = 0; i < studentList.length; i++) {
            System.out.printf("=== Thông tin học sinh thứ %d ===\n", i + 1);
            studentList[i].output();
        }

    }
}
