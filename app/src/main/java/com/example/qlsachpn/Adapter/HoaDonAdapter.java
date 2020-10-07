package com.example.qlsachpn.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.qlsachpn.Model.HoaDon;
import com.example.qlsachpn.R;
import com.example.qlsachpn.SQLike.HoaDonDao;

import java.util.List;

public class HoaDonAdapter extends BaseAdapter {
    private List<HoaDon> hoaDonList;

    public HoaDonAdapter(List<HoaDon> hoaDonList) {
        this.hoaDonList = hoaDonList;
    }

    @Override
    public int getCount() {
        return hoaDonList.size();
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
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.hoadon_row,viewGroup,false);
        TextView tvhd = view.findViewById(R.id.tvhd);
        TextView tvdate = view.findViewById(R.id.tvdate);
        HoaDon hoaDon = hoaDonList.get(i);
        tvhd.setText(hoaDon.getMaHD());
        tvdate.setText(hoaDon.getNgayMua());
        return view;
    }
}
