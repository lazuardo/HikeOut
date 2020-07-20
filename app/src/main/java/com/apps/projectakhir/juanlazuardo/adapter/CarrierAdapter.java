package com.apps.projectakhir.juanlazuardo.adapter;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;


import com.apps.projectakhir.juanlazuardo.R;
import com.apps.projectakhir.juanlazuardo.model.Hikeout;
import com.apps.projectakhir.juanlazuardo.projectakhir.TampilCarrier;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by root on 2/3/17.
 */

public class CarrierAdapter extends RecyclerView.Adapter<CarrierAdapter.MyViewHolder>{
    List<Hikeout> mKontakList;
    ImageView carrier_img;

    public CarrierAdapter(List <Hikeout> KontakList) {
        mKontakList = KontakList;
    }

    @Override
    public MyViewHolder onCreateViewHolder (ViewGroup parent,int viewType){
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_carrier, parent, false);
        MyViewHolder mViewHolder = new MyViewHolder(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder (MyViewHolder holder,final int position){
        //panggil Image
        Glide.with(holder.itemView.getContext())
                .load(mKontakList.get(position).getCarrier_img())
                .placeholder(R.drawable.ic_baseline_help)
                .error(R.drawable.ic_baseline_help)
                .into(carrier_img);

        holder.mTextViewId.setText("Id  = " + mKontakList.get(position).getCarrier_id());
        holder.mTextViewNama.setText("Nama   = " + mKontakList.get(position).getCarrier_nama());
        holder.mTextViewukuran.setText("Ukuran = " + mKontakList.get(position).getCarrier_ukuran());
        holder.mTextViewHarga.setText("Harga   = " + mKontakList.get(position).getCarrier_harga());
        holder.mTextViewDesc.setText(""+ mKontakList.get(position).getCarrier_desc());
    }

    @Override
    public int getItemCount () {
        return mKontakList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewId, mTextViewNama,mTextViewukuran ,mTextViewHarga,mTextViewDesc;
        public ImageView mImageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            carrier_img = itemView.findViewById(R.id.tvImg);
            mTextViewId = (TextView) itemView.findViewById(R.id.tvId);
            mTextViewNama = (TextView) itemView.findViewById(R.id.tvNama);
            mTextViewukuran = (TextView) itemView.findViewById(R.id.tvUkuran);
            mTextViewHarga = (TextView) itemView.findViewById(R.id.tvHarga);
            mTextViewDesc = (TextView) itemView.findViewById(R.id.tvDesc);
        }
    }
}
