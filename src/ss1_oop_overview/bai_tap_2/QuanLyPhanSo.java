package ss1_oop_overview.bai_tap_2;

public class QuanLyPhanSo {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo();
        ps1.nhap();
        PhanSo ps2 = new PhanSo();
        ps2.nhap();

        PhanSo tong = ps1.tinhTong(ps2);
        tong.xuat();
    }
}
