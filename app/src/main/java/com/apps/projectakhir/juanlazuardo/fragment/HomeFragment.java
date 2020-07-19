package com.apps.projectakhir.juanlazuardo.fragment;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.apps.projectakhir.juanlazuardo.R;

import com.apps.projectakhir.juanlazuardo.model.RcvModel;
import com.apps.projectakhir.juanlazuardo.projectakhir.LoginActivity;
import com.apps.projectakhir.juanlazuardo.adapter.RcvAdapter;
import com.apps.projectakhir.juanlazuardo.projectakhir.TampilAksesoris;
import com.apps.projectakhir.juanlazuardo.projectakhir.TampilCarrier;
import com.apps.projectakhir.juanlazuardo.projectakhir.TampilTenda;
import com.apps.projectakhir.juanlazuardo.utils.Preferences;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.apps.projectakhir.juanlazuardo.R.id.card_acc;
import static com.apps.projectakhir.juanlazuardo.R.id.card_carrier;
import static com.apps.projectakhir.juanlazuardo.R.id.card_tent;
import static com.apps.projectakhir.juanlazuardo.R.id.txt_logout;

public class HomeFragment extends Fragment implements View.OnClickListener {
    TextView txtkeluar,txtName,txtAbout;
    ImageView imageView,mImageView2;
    CardView carrier,tent,acc;
    RecyclerView recyclerView;
    ArrayList<RcvModel> rcvModels;
    Dialog mDialog;
    RcvAdapter rcvAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //RecyclerView
        recyclerView = view.findViewById(R.id.merchant);
        Integer[] langLogo = {R.drawable.logo_eiger, R.drawable.consina, R.drawable.logo_rei};

        rcvModels = new ArrayList<>();
        for (int i=0;i<langLogo.length;i++){
            RcvModel model = new RcvModel(langLogo[i]);
            rcvModels.add(model);
        }
        //Design Horizontal Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
                getContext(),LinearLayoutManager.HORIZONTAL, false
        );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        rcvAdapter = new RcvAdapter(getContext(), rcvModels);
        recyclerView.setAdapter(rcvAdapter);


        //Custom Dialog
        mDialog = new Dialog(getContext());
        imageView = view.findViewById(R.id.images_login);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopUp();
            }
        });

        //SharedPreferences
        txtkeluar = view.findViewById(txt_logout);
        txtName = view.findViewById(R.id.txtName);
        carrier = view.findViewById(card_carrier);
        carrier.setOnClickListener(this);
        carrier = view.findViewById(card_carrier);
        carrier.setOnClickListener(this);
        tent = view.findViewById(card_tent);
        tent.setOnClickListener(this);
        acc = view.findViewById(card_acc);
        acc.setOnClickListener(this);
        txtkeluar.setOnClickListener(this);
        declareView();
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txt_logout:
                Preferences.setLogout(getActivity().getBaseContext());
                startActivity(new Intent(getActivity().getBaseContext(), LoginActivity.class));
                break;
            case R.id.card_carrier :
                startActivity(new Intent(getActivity(), TampilCarrier.class));
                break;
            case R.id.card_tent :
                startActivity(new Intent(getActivity(), TampilTenda.class));
                break;
            case R.id.card_acc :
                startActivity(new Intent(getActivity(), TampilAksesoris.class));
                break;
            default:
                break;
        }
    }
    private void declareView() {
        txtName.setText(Preferences.getRegisteredUser(getActivity().getBaseContext()));
    }
    public void showPopUp(){
        mDialog.setContentView(R.layout.custom_popup);
        txtAbout = mDialog.findViewById(R.id.about_me);
        txtAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadFragment(new AboutFragment());
                mDialog.dismiss();
            }

        });

        mImageView2 = mDialog.findViewById(R.id.Close);
        mImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.dismiss();
            }
        });

        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.show();
    }
    private boolean loadFragment (Fragment fragment){
        if (fragment != null) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.fl_container_home, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
