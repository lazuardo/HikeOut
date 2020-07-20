package com.apps.projectakhir.juanlazuardo.adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;


import com.apps.projectakhir.juanlazuardo.R;
import com.apps.projectakhir.juanlazuardo.model.Hikeout;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by root on 2/3/17.
 */

public class TendaAdapter extends RecyclerView.Adapter<TendaAdapter.MyViewHolder>{
    List<Hikeout> mKontakList;
    ImageView tenda_img;
    public TendaAdapter(List <Hikeout> KontakList) {
        mKontakList = KontakList;
    }

    @Override
    public MyViewHolder onCreateViewHolder (ViewGroup parent,int viewType){
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tenda, parent, false);
        MyViewHolder mViewHolder = new MyViewHolder(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder (MyViewHolder holder,final int position){

        Glide.with(holder.itemView.getContext())
                .load(mKontakList.get(position).getTenda_img())
                .placeholder(R.drawable.ic_baseline_help)
                .error(R.drawable.ic_baseline_help)
                .into(tenda_img);

        holder.mTextViewId.setText("Id = " + mKontakList.get(position).getTenda_id());
        holder.mTextViewNama.setText("Nama = " + mKontakList.get(position).getTenda_nama());
        holder.mTextViewukuran.setText("Ukuran = " + mKontakList.get(position).getTenda_ukuran());
        holder.mTextViewHarga.setText("Harga   = " + mKontakList.get(position).getTenda_harga());
        holder.mTextViewDesc.setText(""+ mKontakList.get(position).getTenda_desc());
    }

    @Override
    public int getItemCount () {
        return mKontakList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewId, mTextViewNama,mTextViewukuran ,mTextViewHarga,mTextViewDesc;

        public MyViewHolder(View itemView) {
            super(itemView);
            tenda_img = itemView.findViewById(R.id.tvImg);
            mTextViewId = (TextView) itemView.findViewById(R.id.tvId);
            mTextViewNama = (TextView) itemView.findViewById(R.id.tvNama);
            mTextViewukuran = (TextView) itemView.findViewById(R.id.tvUkuran);
            mTextViewHarga = (TextView) itemView.findViewById(R.id.tvHarga);
            mTextViewDesc = (TextView) itemView.findViewById(R.id.tvDesc);
        }
    }
}
