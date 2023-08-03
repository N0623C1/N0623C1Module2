package ss10_exception;

import ss10_exception.exception.Under18YearsOldException;

public class Main4 {
    public static void main(String[] args) {
        while (true) {
            try {
                try {
                    check(15);
                } catch (Under18YearsOldException e) {
                    System.out.println(e.getMessage());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void check(int age) throws Under18YearsOldException {
        if (age < 18) {
            throw new Under18YearsOldException("Bạn chưa đủ tuổi");
        }
    }
}
