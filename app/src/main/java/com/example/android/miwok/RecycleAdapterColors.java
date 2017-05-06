package com.example.android.miwok;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rahulkapoor on 10/04/17.
 */

public class RecycleAdapterColors extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<ColorData> mcolorArrayList;
    private Context mcontext;

    /**
     *
     * @param context current activity this;
     * @param arrayList array list of objects of ColorData class;
     */
    public RecycleAdapterColors(final Context context, final ArrayList<ColorData> arrayList) {
        this.mcolorArrayList = arrayList;
        this.mcontext = context;
    }

    /**
     *
     * @param parent viewgroup
     * @param viewType view type;
     * @return data holder object to be returned;
     */
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View dataView = inflater.inflate(R.layout.color_recycle_items, parent, false);
        DataHolder dataHolder = new DataHolder(dataView);

        return dataHolder;

    }

    /**
     *
     * @param holder returns viewholder;
     * @param position returns position of the current object of ColorData in array;
     */
    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {

        ColorData colordata = mcolorArrayList.get(position);

        TextView textview = DataHolder.mtextview;
        textview.setText(colordata.getColor());
        ImageView imageview = DataHolder.mimageview;
        imageview.setImageResource(colordata.getImageID());

    }

    /**
     *
     * @return size of array;
     */
    @Override
    public int getItemCount() {
        return mcolorArrayList.size();
    }

    /**
     * inner class to get the single view;
     */
    public static class DataHolder extends RecyclerView.ViewHolder {

        private static ImageView mimageview;
        private static TextView mtextview;

        /**
         *
         * @param itemView View ;
         */
        public DataHolder(final View itemView) {
            super(itemView);
            mimageview = (ImageView) itemView.findViewById(R.id.colorimageplaceholder);
            mtextview = (TextView) itemView.findViewById(R.id.tv_colorname);
        }
    }
}
