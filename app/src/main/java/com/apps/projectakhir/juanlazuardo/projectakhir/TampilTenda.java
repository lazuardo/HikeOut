package com.apps.projectakhir.juanlazuardo.projectakhir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.apps.projectakhir.juanlazuardo.R;
import com.apps.projectakhir.juanlazuardo.adapter.CarrierAdapter;
import com.apps.projectakhir.juanlazuardo.adapter.TendaAdapter;
import com.apps.projectakhir.juanlazuardo.model.Hikeout;
import com.apps.projectakhir.juanlazuardo.model.HikeoutGET;
import com.apps.projectakhir.juanlazuardo.utils.ApiClient;
import com.apps.projectakhir.juanlazuardo.utils.ApiInterface;

import android.util.Log;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TampilTenda extends AppCompatActivity {

    ApiInterface mApiInterface;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public static TampilTenda ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        ma=this;
        refresh();
    }

    public void refresh() {
        Call<HikeoutGET> kontakCall = mApiInterface.getdataTenda();
        kontakCall.enqueue(new Callback<HikeoutGET>() {
            @Override
            public void onResponse(Call<HikeoutGET> call, Response<HikeoutGET>
                    response) {
                List<Hikeout> KontakList2 = response.body().getDataTenda();
                Log.d("Retrofit Get", "Jumlah data Kontak: " +
                        String.valueOf(KontakList2.size()));
                mAdapter = new TendaAdapter(KontakList2);
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<HikeoutGET> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });
    }
}
