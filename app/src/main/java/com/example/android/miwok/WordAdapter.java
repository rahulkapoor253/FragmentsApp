package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * this class is the adapter class which extends array adapter of object type;
 */

public class WordAdapter extends ArrayAdapter<Numberdata> {


    /**
     * @param context         calls to super
     * @param pWords          calls to super
     */
    public WordAdapter(final Context context, final ArrayList<Numberdata> pWords) {
        super(context, 0, pWords);

    }


    @NonNull
    @Override
    public View getView(final int position, @Nullable final View convertView, @Nullable final ViewGroup parent) {
        View listitemview = convertView;
        if (listitemview == null) {
            listitemview = LayoutInflater.from(getContext()).inflate(R.layout.simple_list_item_1, parent, false);

        }

        Numberdata obj = getItem(position);

        TextView tvenglish = (TextView) listitemview.findViewById(R.id.tv_english);
        tvenglish.setText(obj.getEnglish());

        TextView tvnumber = (TextView) listitemview.findViewById(R.id.tv_number);
        tvnumber.setText(obj.getNumber());

        ImageView setimage = (ImageView) listitemview.findViewById(R.id.placeholder_image);
        if (obj.hasImage()) {
            setimage.setImageResource(obj.getImageId());
            setimage.setVisibility(View.VISIBLE);
        } else {
            setimage.setVisibility(View.GONE);

        }

        return listitemview;


    }
}
