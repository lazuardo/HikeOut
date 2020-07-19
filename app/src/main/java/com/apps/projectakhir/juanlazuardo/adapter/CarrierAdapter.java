package com.apps.projectakhir.juanlazuardo.adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;


import com.apps.projectakhir.juanlazuardo.R;
import com.apps.projectakhir.juanlazuardo.model.Hikeout;

import java.util.List;

/**
 * Created by root on 2/3/17.
 */

public class CarrierAdapter extends RecyclerView.Adapter<CarrierAdapter.MyViewHolder>{
    List<Hikeout> mKontakList;

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
        holder.mTextViewId.setText("Id = " + mKontakList.get(position).getCarrier_id());
        holder.mTextViewNama.setText("Nama = " + mKontakList.get(position).getCarrier_nama());
        holder.mTextViewNomor.setText("Nomor = " + mKontakList.get(position).getCarrier_harga());
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent mIntent = new Intent(view.getContext(), EditActivity.class);
//                mIntent.putExtra("Id", mKontakList.get(position).getId());
//                mIntent.putExtra("Nama", mKontakList.get(position).getNama());
//                mIntent.putExtra("Nomor", mKontakList.get(position).getNomor());
//                view.getContext().startActivity(mIntent);
//            }
//        });
    }

    @Override
    public int getItemCount () {
        return mKontakList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewId, mTextViewNama, mTextViewNomor;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTextViewId = (TextView) itemView.findViewById(R.id.tvId);
            mTextViewNama = (TextView) itemView.findViewById(R.id.tvNama);
            mTextViewNomor = (TextView) itemView.findViewById(R.id.tvNomor);
        }
    }
}
