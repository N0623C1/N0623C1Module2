package ss10_exception;

public class Main3 {
    public static void main(String[] args) {
        try {
            Integer.parseInt("123");
            int[] arr = {10, 20};
            arr[1] = 100;
            System.out.println("Line số 7");
            int a = 1 / 1; // Vô cùng
            return;
        } catch (NumberFormatException e) {
            System.out.println("Không phải format số");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ngoại phạm vi của mảng");
        } catch (ArithmeticException e) {
            System.out.println("Không thể chia cho 0");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Lỗi không thể kiểm soát");
        } finally {
            System.out.println("finally Luôn luôn được thực thi");
        }

        System.out.println("Luôn luôn được thực thi");
    }
}
