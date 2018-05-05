package com.bharat.touristapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Bharat on 2/20/2018.
 */


class MonumentAdapter extends ArrayAdapter{

    private int LayoutResource;

    public MonumentAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        LayoutResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(getContext()).inflate(LayoutResource,null);
        }


        ImageView image = view.findViewById(R.id.image);
        TextView title = view.findViewById(R.id.title);
        TextView description = view.findViewById(R.id.description);

        Monument monument = (Monument) getItem(position);

        image.setImageResource(monument.getmImageId());
        title.setText(monument.getmTitle());
        description.setText(monument.getmDescription());

        return view;
    }
}
