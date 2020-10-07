package com.example.qlsachpn.Model;

public class NguoiDung {
    private String userName,passWord,Phone,hoTen;

    public NguoiDung() {
    }

    public NguoiDung(String userName, String passWord, String phone, String hoTen) {
        this.userName = userName;
        this.passWord = passWord;
        this.Phone = phone;
        this.hoTen = hoTen;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}
