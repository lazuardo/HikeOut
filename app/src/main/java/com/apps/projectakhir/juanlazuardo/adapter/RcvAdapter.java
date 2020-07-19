package com.apps.projectakhir.juanlazuardo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apps.projectakhir.juanlazuardo.model.RcvModel;
import com.apps.projectakhir.juanlazuardo.R;
import java.util.ArrayList;

public class RcvAdapter extends RecyclerView.Adapter<RcvAdapter.ViewHolder> {

    ArrayList<RcvModel> rcvModel;
    Context context;

    public RcvAdapter(Context context, ArrayList<RcvModel> rcvModel){
        this.context = context;
        this.rcvModel = rcvModel;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_merchant, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(rcvModel.get(position).getLangLogo());
    }

    @Override
    public int getItemCount() {
        return rcvModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imgmerchant);

        }
    }
}
