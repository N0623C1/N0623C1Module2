package ss5_polymorphism.exercise;

public class NVChinhThuc extends HocVien {
    // Định nghĩa lại phương thức của lớp cha sao cho phù hợp với lớp con
    @Override
    public void run() {
        System.out.println("NV chính thức chạy nhanh");
    }
}
