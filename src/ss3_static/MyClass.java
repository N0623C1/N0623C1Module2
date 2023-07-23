package ss3_static;

public class MyClass {
    static int a = 2;
    int b = 2;

    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        MyClass m2 = new MyClass();

        m1.a++; // 3
        m1.b++; // 3

        m2.a++;
        m2.b++;

        System.out.println(m1.a); // kết quả? => 4 =>
        System.out.println(m1.b); // kết quả? => 3 =>
    }
}

