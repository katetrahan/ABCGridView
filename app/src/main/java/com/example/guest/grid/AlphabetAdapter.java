package com.example.guest.grid;


import android.content.Context;
import android.support.v4.widget.TextViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AlphabetAdapter extends BaseAdapter {
    private Context mContext;
    private String[] mLetters;

    public AlphabetAdapter(Context context, String[] letters) {
        this.mContext = context;
        this.mLetters = letters;
    }



    @Override
    public int getCount() {
        return mLetters.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {
            //get layout from xml file
            gridView = inflater.inflate(R.layout.layout, null);


            //pull views
            TextView letterView = (TextView) gridView
                    .findViewById(R.id.grid_item_letter);

            //set values into views
            letterView.setText("A"); //dummy data
        } else {
            gridView = (View) convertView;

        }

        return gridView;

    }


}
