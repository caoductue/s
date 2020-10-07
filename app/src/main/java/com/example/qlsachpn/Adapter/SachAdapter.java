package com.example.qlsachpn.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.qlsachpn.Model.Sach;
import com.example.qlsachpn.R;

import java.util.List;

public class SachAdapter extends BaseAdapter {
    private List<Sach> sachList;

    public SachAdapter(List<Sach> sachList) {
        this.sachList = sachList;
    }

    @Override
    public int getCount() {
        return sachList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sach_row,viewGroup,false);
        TextView tvmasach = view.findViewById(R.id.tvmasach);
        TextView tvtheloaisach = view.findViewById(R.id.tvtheloaisach);
        TextView tvtensach = view.findViewById(R.id.tvtensach);
        TextView tvtacgia = view.findViewById(R.id.tvtacgia);
        TextView tvnhaxuatban = view.findViewById(R.id.tvnhaxuatban);
        TextView tvdongia = view.findViewById(R.id.tvdongia);
        TextView tvsoluong = view.findViewById(R.id.tvsoluong);

        Sach  sach = sachList.get(i);
        tvmasach.setText(sach.getMaSach());
        tvtheloaisach.setText(sach.getMaTheLoai());
        tvtensach.setText(sach.getTenSach());
        tvtacgia.setText(sach.getMaSach());
        tvnhaxuatban.setText(sach.getMaSach());
        tvdongia.setText(sach.getMaSach());
        tvsoluong.setText(sach.getMaSach());
        return view;
    }
}
