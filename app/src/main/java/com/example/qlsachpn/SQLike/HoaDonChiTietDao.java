package com.example.qlsachpn.SQLike;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import com.example.qlsachpn.Model.HDChiTiet;

import java.util.ArrayList;
import java.util.List;

public class HoaDonChiTietDao extends Mysqlike {
    public HoaDonChiTietDao(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "data.sql", null, 1);
    }
    public void addHDCT(HDChiTiet hdChiTiet){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put("maHDCT",hdChiTiet.getMaHDCT());
        values.put("maHD",hdChiTiet.getMaHDCT());
        values.put("maSach",hdChiTiet.getMaHDCT());
        values.put("soLuongMua",hdChiTiet.getMaHDCT());
        sqLiteDatabase.insert("hoadonchitiet",null,values);
    }
    public void updateHDCT(HDChiTiet hdChiTiet){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("maHDCT",hdChiTiet.getMaHDCT());
        values.put("maHD",hdChiTiet.getmaHD());
        values.put("maSach",hdChiTiet.getMaSach());
        values.put("soLuongMua",hdChiTiet.getSoLuongMua());
        sqLiteDatabase.update("hoadonchitiet",values,"maHDCT=?",new String[]{String.valueOf(hdChiTiet.getMaHDCT())});
    }
    public void deleteHDCT(String maHDCT){
        SQLiteDatabase db = getReadableDatabase();
        db.delete("hoadonchitiet","maHDCT=?",new String[]{maHDCT});
    }
    public List<HDChiTiet> getAll(){
        List<HDChiTiet> hdChiTietList = new ArrayList<>();
        String get_all = "SELECT * FROM hoadonchitiet";
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(get_all,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            String mahdct,mahd,masach,soluongmua;
            mahdct = cursor.getString(0);
            mahd = cursor.getString(1);
            masach = cursor.getString(2);
            soluongmua = cursor.getString(3);
            HDChiTiet hdChiTiet = new HDChiTiet(mahdct,mahd,masach,soluongmua);
            hdChiTietList.add(hdChiTiet);
            cursor.moveToNext();
        }
        cursor.close();
        return hdChiTietList;
    }
}

