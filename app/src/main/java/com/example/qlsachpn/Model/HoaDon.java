package com.example.qlsachpn.Model;

public class HoaDon {
    private String maHD;
    private String ngayMua;

    public HoaDon() {
    }

    public HoaDon(String maHD, String ngayMua) {
        this.maHD = maHD;
        this.ngayMua = ngayMua;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(String ngayMua) {
        this.ngayMua = ngayMua;
    }
}
