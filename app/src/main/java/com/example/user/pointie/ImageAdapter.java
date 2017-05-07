package com.example.user.pointie;

/**
 * Created by user on 7/5/2017.
 */

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.AbsListView.LayoutParams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
        ArrayList<String> arraylistitem =new ArrayList<String>();
         new AsyncHttp().execute();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // arraylistitem =
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        try{


        } catch (Exception e) {
            e.printStackTrace();
        }


        imageView.setImageResource(mThumbIds[position]);
        imageView.setLayoutParams(new LayoutParams(350, 350));
        return imageView;
    }

    String mock1TileBase64="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";
    public Integer[] mThumbIds = {
            R.drawable.chs, R.drawable.chs1, R.drawable.chs2, R.drawable.chs3,R.drawable.chs4
  };

}
