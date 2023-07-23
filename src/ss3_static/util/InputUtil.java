package ss3_static.util;

import java.util.Scanner;

public class InputUtil {
    static Scanner scanner = new Scanner(System.in);

    public static int inputPositive(String name) {
        int n;
        do {
            System.out.printf("Nhập vào %s: ", name);
            n = Integer.parseInt(scanner.nextLine());

            if (n <= 0) {
                System.out.printf("Giá trị bạn nhập vào không hợp lệ (%s > 0), xin nhập lại\n", name);
            }
        } while (n <= 0);

        return n;
    }
}
