package com.example.qlsachpn.Model;

public class Sach {
    private String maSach, maTheLoai;
    private String tacGia, NXB,tenSach;
    private double giaBan;
    private String soLuong;

    public Sach() {
    }

    public Sach(String maSach, String maTheLoai, String tacGia, String NXB, String tenSach, double giaBan, String soLuong) {
        this.maSach = maSach;
        this.maTheLoai = maTheLoai;
        this.tacGia = tacGia;
        this.NXB = NXB;
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
    }

    public Sach(String masach, String matheloai, String tacgia, String nxb, String tensach, String giaban, String soluong) {

    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getMaTheLoai() {
        return maTheLoai;
    }

    public void setMaTheLoai(String maTheLoai) {
        this.maTheLoai = maTheLoai;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }
}