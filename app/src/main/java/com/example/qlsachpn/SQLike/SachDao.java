package com.example.qlsachpn.SQLike;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import com.example.qlsachpn.Model.Sach;

import java.util.ArrayList;
import java.util.List;

public class SachDao extends Mysqlike {
    public SachDao(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "data.sql", null, 1);
    }
    public void addSach(Sach sach){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put("maSach",sach.getMaSach());
        values.put("maTheLoai",sach.getMaTheLoai());
        values.put("tacGia",sach.getTacGia());
        values.put("NXB",sach.getNXB());
        values.put("tenSach",sach.getTenSach());
        values.put("giaBan",sach.getGiaBan());
        values.put("soLuong",sach.getSoLuong());
        sqLiteDatabase.insert("book",null,values);
    }
    public void updateSach(Sach sach){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("maSach",sach.getMaSach());
        values.put("maTheLoai",sach.getMaTheLoai());
        values.put("tacGia",sach.getTacGia());
        values.put("NXB",sach.getNXB());
        values.put("tenSach",sach.getTenSach());
        values.put("giaBan",sach.getGiaBan());
        values.put("soLuong",sach.getSoLuong());
        db.update("book",values,"maSach=?",new String[]{sach.getMaSach()});
    }
    public void deleteSach(String maSach){
        SQLiteDatabase db = getReadableDatabase();
        db.delete("book","maSach=?",new String[]{maSach});
    }
    public List<Sach> getAll(){
        List<Sach> sachList = new ArrayList<>();
        String get_all = "SELECT * FROM book";
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor =db.rawQuery(get_all,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            String masach,matheloai,tacgia,nxb,tensach,giaban,soluong;
            masach = cursor.getString(0);
            matheloai = cursor.getString(1);
            tacgia = cursor.getString(2);
            nxb = cursor.getString(3);
            tensach = cursor.getString(4);
            giaban = cursor.getString(5);
            soluong = cursor.getString(6);
            Sach sach = new Sach(masach,matheloai,tacgia,nxb,tensach,giaban,soluong);
            sachList.add(sach);
            cursor.moveToNext();
        }
        cursor.close();
        return sachList;
    }
}
