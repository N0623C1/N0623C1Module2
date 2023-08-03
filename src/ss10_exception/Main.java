package ss10_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Nhập vào số

        Scanner scanner = new Scanner(System.in);

        int a;
        while (true) {
            System.out.print("Nhập vào số nguyên: ");
            try {
                a = scanner.nextInt(); //sdfsdf enter
                break;
            } catch (InputMismatchException e) {
                System.out.println("Bạn phải nhập vào số, xin nhập lại!!!");
                scanner.nextLine(); // Xóa hết dữ liệu ở trong scanner
            }
        }

        System.out.println("a: " + a);

    }
}
