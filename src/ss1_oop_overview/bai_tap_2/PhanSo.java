package ss1_oop_overview.bai_tap_2;

import java.util.Scanner;

public class PhanSo {
    int tu;
    int mau;

    void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tử: ");
        this.tu = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào mau: ");
        this.mau = Integer.parseInt(scanner.nextLine());
    }

    void xuat() {
        // Chuẩn hóa: Tìm Ước chung lớn nhất...
        System.out.printf("%d/%d", tu, mau);
    }

    // Tính tổng
    // a / b + c / d = (a * d + b * c )/ (b * d)
    PhanSo tinhTong(PhanSo ps) {
        PhanSo tong = new PhanSo();

        tong.tu = this.tu * ps.mau + this.mau * ps.tu;
        tong.mau = this.mau * ps.mau;

        return tong;
    }
}
