package com.example.qlsachpn.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.qlsachpn.Model.HDChiTiet;
import com.example.qlsachpn.Model.HoaDon;
import com.example.qlsachpn.R;

import java.util.List;

public class HDCT_Adapter extends BaseAdapter {
    private List<HDChiTiet> hdChiTietList;
    public HDCT_Adapter(List<HDChiTiet> hdChiTiets){
        this.hdChiTietList = hdChiTiets;
    }
    @Override
    public int getCount() {
        return hdChiTietList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hoadonchitiet_row,parent,false);
        TextView tvhdct = view.findViewById(R.id.tvhdct);
        TextView tvhd = view.findViewById(R.id.tvhd);
        TextView tvsach = view.findViewById(R.id.tvsach);
        TextView tvsotien = view.findViewById(R.id.tvsotien);
        //khoi tao lại listview

        HDChiTiet hdChiTiet = hdChiTietList.get(i);
        tvhdct.setText(hdChiTiet.getMaHDCT());
        tvhd.setText(hdChiTiet.getmaHD());
        tvsach.setText(hdChiTiet.getMaSach());
        tvsotien.setText(hdChiTiet.getSoLuongMua());
        return view;
    }
}
