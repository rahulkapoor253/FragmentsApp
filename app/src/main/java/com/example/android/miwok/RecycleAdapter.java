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
 * view holder class for recycler view that makes refernces to memory;
 */

public class RecycleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<FamilyData> mfamilyDatas;
    private Context mContext;


    /**
     *
     * @param context context
     * @param familyDatas arraylist of object of class family data;
     */
    public RecycleAdapter(final Context context, final ArrayList<FamilyData> familyDatas) {
        this.mfamilyDatas = familyDatas;
        this.mContext = context;
    }

    /**
     *
     * @return context;
     */
    private Context getContext() {
        return mContext;
    }

    /**
     *
     * @param parent paernt argument;
     * @param viewType view type;
     * @return returns the object of DataHolder;
     */
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View dataView = inflater.inflate(R.layout.activity_recycle_items, parent, false);

        DataHolder dataHolder = new DataHolder(dataView);

        return dataHolder;
    }

    /**
     *
     * @param holder view holder tht makes memory references
     * @param position to get posistion to store the data;
     */
    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {

        FamilyData familydata = mfamilyDatas.get(position);

        TextView textview = DataHolder.msettext;
        textview.setText(familydata.getFamilyMember());
        ImageView imageview = DataHolder.msetimage;
        imageview.setImageResource(familydata.getImageID());

    }

    /**
     *
     * @return size of arraylist;
     */
    @Override
    public int getItemCount() {

        return mfamilyDatas.size();

    }


    /**
     * class DataHolder that sets data to the view;
     */
    public static class DataHolder extends RecyclerView.ViewHolder {
        private static TextView msettext;
        private static ImageView msetimage;

        /**
         *
         * @param view constructor is fired;
         */
        public DataHolder(final View view) {
            super(view);
            msettext = (TextView) itemView.findViewById(R.id.familytext1);
            msetimage = (ImageView) itemView.findViewById(R.id.familyimageplaceholder);


        }

    }
}
