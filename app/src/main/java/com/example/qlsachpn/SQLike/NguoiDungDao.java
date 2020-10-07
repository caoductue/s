package com.example.qlsachpn.SQLike;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import com.example.qlsachpn.Model.NguoiDung;

import java.util.ArrayList;
import java.util.List;

public class NguoiDungDao extends Mysqlike {

    private Mysqlike mysqlike;

    public NguoiDungDao(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "data.sql", null, 1);
    }
//Them nguoi dung
    public void addNguoiDung(NguoiDung nguoiDung){
        SQLiteDatabase db = getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put("userName",nguoiDung.getUserName());
        values.put("passWord",nguoiDung.getPassWord());
        values.put("Phone",nguoiDung.getPhone());
        values.put("hoTen",nguoiDung.getHoTen());
        db.insert("user",null,values);

    }
    //sua nguoi dung
    public void updateNguoiDung(NguoiDung nguoiDung){
        SQLiteDatabase db = getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put("userName",nguoiDung.getUserName());
        values.put("passWord",nguoiDung.getPassWord());
        values.put("Phone",nguoiDung.getPhone());
        values.put("hoTen",nguoiDung.getHoTen());
        db.update("user",values,"userName=?",new String[]{nguoiDung.getUserName()});

    }
    //xoa nguoi dung
    public void deleteNguoiDung(String userName){
        SQLiteDatabase db = getReadableDatabase();
        db.delete("user","userName=?",new String[]{userName});
    }
    public List<NguoiDung> getAll(){
        List<NguoiDung> nguoiDungList = new ArrayList<>();
        String sql = "SELECT * FROM user";
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(sql,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            String username ,password,phone,hoten;
            username = cursor.getString(0);
            password = cursor.getString(1);
            phone = cursor.getString(2);
            hoten = cursor.getString(3);
            NguoiDung nguoiDung =new NguoiDung(username,password,phone,hoten);
            nguoiDungList.add(nguoiDung);
            cursor.moveToNext();
        }
        cursor.close();
        return nguoiDungList;


    }
}
