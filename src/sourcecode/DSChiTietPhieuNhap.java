/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoAn_QLTV_main.src.sourcecode;

/**
 *
 * @author Luong Thanh Tuan
 */


import java.util.Scanner;

public class DSChiTietPhieuNhap {
    private ChiTietPhieuNhap[] dsChiTiet;
    private int soLuongCTPN;
    Scanner sc = new Scanner(System.in);

    public DSChiTietPhieuNhap(int soLuong) {
        dsChiTiet = new ChiTietPhieuNhap[soLuong];
        soLuongCTPN = 0;
    }

    public void themChiTietPhieuNhap(ChiTietPhieuNhap ctpn) {
        if (soLuongCTPN < dsChiTiet.length) {
            dsChiTiet[soLuongCTPN] = ctpn;
            soLuongCTPN++;
        } else {
            System.out.println("Danh sách chi tiết phiếu nhập đã đầy.");
        }
    }

    public void xuatDanhSachChiTiet() {
        System.out.println("+--------------------+----------+--------------+--------------+");
        System.out.println("|      San pham      | So luong |    Don gia   |  Thanh tien  |");
        System.out.println("+--------------------+----------+--------------+--------------+");
        for (int i = 0; i < soLuongCTPN; i++) {
            dsChiTiet[i].xuatCTPN();
        }
        System.out.println("+--------------------+----------+--------------+--------------+");
    }

    public double tinhTongTien() {
        double tongTien = 0;
        for (int i = 0; i < soLuongCTPN; i++) {
            tongTien += dsChiTiet[i].getThanhTien();
        }
        return tongTien;
    }
}

