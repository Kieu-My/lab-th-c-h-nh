/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithuchanh;

import java.util.Scanner;

/**
 *
 * @author Truon
 */
class SinhVienNhap {
    private int maSV;
    private String hoTen;
    private String diaChi;
    private int sDt;
 

    public SinhVienNhap() {
 
    }

    public SinhVienNhap(int maSV, String hoten, String diaChi, String sdt) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sDt = sDt;
    }
    
    public int getMaSV() {
        return maSV;
    }
 
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }
 
    public String getHoten() {
        return hoTen;
    }
 
    public void setHoten(String hoten) {
        this.hoTen = hoten;
    }
 
    public String getDiaChi() {
        return diaChi;
    }
 
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
 
    public int getsDt() {
        return sDt;
    }
 
    public void setsDt(int sDt) {
        this.sDt = sDt;
    }
    
    @Override
    public String toString() {

       return "maSV =" + maSV + ", hoTen =" + hoTen + ", diaChi =" + diaChi + ", sDt =" + sDt  ;

    }

    public void hienThiTT() {
        System.out.printf("\n", maSV, hoTen, diaChi, sDt);
    }
}
    public class main {
        static Scanner sc = new Scanner(System.in);
    static void nhapThongTinh(SinhVienNhap tt) {
        System.out.println("Nhập mã số sinh viên: ");
        tt.setMaSV(sc.nextInt());
        
        sc.nextLine();
        System.out.println("Nhập họ và tên sinh viên: ");
        tt.setHoten(sc.nextLine());
        System.out.println("Nhập địa chỉ sinh viên: ");
        tt.setDiaChi(sc.nextLine());
        do {
            System.out.println("Nhập số điện thoại bao gồm 9 số: ");
            tt.setsDt(sc.nextInt());
            
        }while (9 != tt.getsDt() );
    }
 
    public static void main(String[] args) {
        SinhVienNhap sv[] = null;
        int a, n = 0;
        boolean flag = true;
        do {
            System.out.println("Bạn chọn làm gì?");
            System.out.println("1.Nhập thông tin sinh viên. \n" +
                    "2.Xuất bản danh sách sinh viên.\n" +
                    "Nhập số khác để thoát");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Nhập số lương sinh viên cần khai báo: ");
                    n = sc.nextInt();
                    sv = new SinhVienNhap[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên thứ " + (i + 1)+": ");
                        sv[i] = new SinhVienNhap();
                        nhapThongTinh(sv[i]);
 
                    }
 
                    break;
                case 2:
                    SinhVienNhap temp = sv[0];
                    for (int i = 0; i < sv.length - 1; i++) {
                        for (int j = i + 1; j < sv.length; j++) {
                            if (sv[i].getMaSV() > sv[j].getMaSV()) {
                                temp = sv[j];
                                sv[j] = sv[i];
                                sv[i] = temp;
                            }
                        }
                    }
                    System.out.printf(" \n", "MSSV", "Họ và tên", "Địa chỉ", "Số điện thoại");
                    for (int i = 0; i < n; i++) {
                        sv[i].hienThiTT();
                    }
                    break;
                default:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
            }
        } while (flag);
    }

    private static int lengh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    


