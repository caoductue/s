package com.example.qlsachpn.SQLike;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import com.example.qlsachpn.Model.TheLoai;

import java.util.ArrayList;
import java.util.List;

public class TheLoaiDao extends Mysqlike {

    public TheLoaiDao(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "data.sql", null, 1);

    }
    public void addTL(TheLoai theLoai){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put("maTheLoai",theLoai.getMaTheLoai());
        values.put("tenTheLoai",theLoai.getTenTheLoai());
        values.put("moTa",theLoai.getMoTa());
        sqLiteDatabase.insert("theloaisach",null,values);
    }
    public void updateTL(TheLoai theLoai){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("maTheLoai",theLoai.getMaTheLoai());
        values.put("tenTheLoai",theLoai.getTenTheLoai());
        values.put("moTa",theLoai.getMoTa());
        sqLiteDatabase.update("theloaisach",values,"maTheLoai=?",new String[]{theLoai.getMaTheLoai()});
    }
    public void deleteTL(String maTheLoai){
        SQLiteDatabase db = getReadableDatabase();
        db.delete("theloaisach","maTheLoai=?",new String[]{maTheLoai});
    }
    public List<TheLoai> getAll(){
        List<TheLoai> theLoaiList = new ArrayList<>();
        String get_all = "SELECT * FROM theloaisach";
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(get_all,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            String matheloai,tentheloai,mota;
            matheloai = cursor.getString(0);
            tentheloai = cursor.getString(1);
            mota = cursor.getString(2);
            TheLoai theLoai = new TheLoai(matheloai,tentheloai,mota);
            theLoaiList.add(theLoai);
            cursor.moveToNext();
        }
        cursor.close();
        return  theLoaiList;
    }
}
