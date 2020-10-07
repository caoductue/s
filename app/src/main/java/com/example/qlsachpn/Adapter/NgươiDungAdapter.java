package com.example.qlsachpn.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.qlsachpn.Model.NguoiDung;
import com.example.qlsachpn.R;

import org.w3c.dom.Text;

import java.util.List;

public class NgươiDungAdapter  extends BaseAdapter {
    private List<NguoiDung> nguoiDungList;

    public NgươiDungAdapter(List<NguoiDung> nguoiDungList) {
        this.nguoiDungList = nguoiDungList;
    }

    @Override
    public int getCount() {
        return 0;
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
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_row,viewGroup,false);
        TextView tvhoten = view.findViewById(R.id.tvhoten);
        TextView tvsdt = view.findViewById(R.id.tvsdt);
        NguoiDung nguoiDung = nguoiDungList.get(i);
        tvhoten.setText(nguoiDung.getHoTen());
        tvsdt.setText(nguoiDung.getPhone());
        return view;
    }
}
