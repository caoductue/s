package com.example.qlsachpn.SQLike;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import com.example.qlsachpn.Model.HoaDon;
import com.example.qlsachpn.Model.NguoiDung;

import java.util.ArrayList;
import java.util.List;

public class HoaDonDao extends Mysqlike {
    public HoaDonDao(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "data.sql", null, 1);
    }
    //them hoa don
    public void addHoaDon(HoaDon hoaDon) {
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put("maHD", hoaDon.getMaHD());
        values.put("ngayMua", hoaDon.getNgayMua());
        sqLiteDatabase.insert("hoadon", null, values);
    }
    //sua hoa don
    public void updatHoaDon(HoaDon hoaDon) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("maHD", hoaDon.getMaHD());
        values.put("ngayMua", hoaDon.getNgayMua());
        sqLiteDatabase.update("hoadon",values,"maHD=?",new String[]{hoaDon.getMaHD()});
    }
    //Xoa hoa don
    public void deleteHoaDon(String maHD){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        sqLiteDatabase.delete("HoaDon","maHD=?",new String[]{maHD});
    }

    public List<HoaDon> getAll() {
        List<HoaDon> hoaDonList = new ArrayList<>();
        String sql = "SELECT * FROM hoadon";
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            String maHoaDon, ngayMua;
            maHoaDon = cursor.getString(0);
            ngayMua = cursor.getString(1);
            HoaDon hoaDon = new HoaDon(maHoaDon,ngayMua);
            hoaDonList.add(hoaDon);
            cursor.moveToNext();
        }
        cursor.close();
        return hoaDonList;
    }
}
