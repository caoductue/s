package com.example.qlsachpn.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.qlsachpn.Model.TheLoai;
import com.example.qlsachpn.R;

import java.util.List;

public class TheLoaiAdapter extends BaseAdapter {
    private List<TheLoai> theLoaiList;

    public TheLoaiAdapter(List<TheLoai> theLoaiList) {
        this.theLoaiList = theLoaiList;
    }

    @Override
    public int getCount() {
        return theLoaiList.size();
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
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.theloai_row,viewGroup,false);
        TextView tvmatheloai = view.findViewById(R.id.tvmatheloai);
        TextView tvtentheloai = view.findViewById(R.id.tvtentheloai);
        TextView tvmota = view.findViewById(R.id.tvmota);

        TheLoai theLoai = theLoaiList.get(i);
        tvmatheloai.setText(theLoai.getMaTheLoai());
        tvtentheloai.setText(theLoai.getTenTheLoai());
        tvmatheloai.setText(theLoai.getMaTheLoai());
        tvmota.setText(theLoai.getMoTa());
        return view;
    }
}
