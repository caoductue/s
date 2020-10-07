package com.example.qlsachpn.SQLike;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Mysqlike extends SQLiteOpenHelper {
    public Mysqlike(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "data.sql", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String User =  "create table user(" +
                "userName NVARCHAR(50) primary key," +
                "Password NVARCHAR(50) NOT NULL," +
                "Phone NCHAR(10) NOT NULL," +
                "hoTen NVARCHAR(50))";
        String Book = "create table book("+
                "MaSach NCHAR(5) primary key NOT NULL," +
                "MaTheLoai NCHAR(50) NOT NULL," +
                "TacGia NVARCHAR(50)," +
                "NXB NVARCHAR(50)," +
                "giaBia float NOT NULL," +
                "soLuong INT NOT NULL)";
        String HoaDon =  "create table hoadon("+
                "MaHoaDon NCHAR(7) primary key NOT NULL," +
                "NgayMua DATE NOT NULL)";
        String TLBook = "create table theloaisach("+
                "MaTheLoai CHAR(5) primary key NOT NULL," +
                "tenTheLoai NVARCHAR(50) NOT NULL," +
                "moTa NVARCHAR(255)," +
                "viTri INT)";
        String HoaDonCT = "create table hoadonchitiet("+
                "MaHDCT INT primary key," +
                "MaHoaDon NCHAR(7)  NOT NULL," +
                "MaSach NCHAR(5) NOT NULL," +
                "SoLuongMua INT NOT NULL," +
                "FOREIGN KEY(MaSach) REFERENCES HoaDonCT(MaSach)," +
                "FOREIGN KEY(MaHoaDon) REFERENCES HoaDonCT(MaHoaDon))";

        db.execSQL(User);
        db.execSQL(Book);
        db.execSQL(HoaDon);
        db.execSQL(TLBook);
        db.execSQL(HoaDonCT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
