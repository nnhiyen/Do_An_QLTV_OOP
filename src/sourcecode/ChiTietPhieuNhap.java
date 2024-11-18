/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoAn_QLTV_main.src.sourcecode;
import java.util.Scanner;
/**
 *
 * @author Luong Thanh Tuan
 */
public class ChiTietPhieuNhap {
    private String maPN;
    private String maTL;
    private int soLuong;
    private double giaTien;
    private double thanhTien;
    Scanner sc = new Scanner(System.in);
    
    
    public ChiTietPhieuNhap(){}
    
    public ChiTietPhieuNhap(String maPN, String maTL, int soLuong, double giaTien, double thanhTien) {
        this.maPN = maPN;
        this.maTL = maTL;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
        this.thanhTien = thanhTien;
    }

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    
    public void nhap(){
        System.out.println("Nhập mã tài liệu: ");
        maTL = checkLoi.checkMaTaiLieu();
        System.out.println("Nhap so luong:");
        this.soLuong = checkLoi.checkSoLuong();
    }

    public void xuatCTPN() {
        String ctpn_format = "| %-18s | %-8s | %-12.2f | %-12.2f | %n";
        System.out.format(ctpn_format, maTL, soLuong, giaTien, getThanhTien());
    }

    @Override
    public String toString() {
        return maPN + ", " + maTL + ", " + soLuong + ", " + giaTien + ", " + thanhTien;
    }
    
}
