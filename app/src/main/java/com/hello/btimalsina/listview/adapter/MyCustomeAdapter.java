package com.hello.btimalsina.listview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.hello.btimalsina.listview.R;
import com.hello.btimalsina.listview.module.Rank;

import java.util.ArrayList;

/**
 * Created by btimalsina on 6/19/2016.
 */
public class MyCustomeAdapter extends ArrayAdapter<Rank> {
    Context context;
    ArrayList<Rank> list;

    public MyCustomeAdapter(Context context, int resource, ArrayList<Rank> list) {
        super(context, resource, list);
        this.context = context;
        this.list = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(context).inflate(R.layout.listview, parent, false);
        TextView txtCountry = (TextView)v.findViewById(R.id.txtCountry);
        TextView txtRank = (TextView)v.findViewById(R.id.txtRank);
        Rank r = getItem(position);
        txtCountry.setText(r.getCountryName());
        txtRank.setText(r.getRank()+"");
        return v;
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
