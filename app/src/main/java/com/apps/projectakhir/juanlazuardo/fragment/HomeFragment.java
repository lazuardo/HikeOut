package com.apps.projectakhir.juanlazuardo.fragment;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.apps.projectakhir.juanlazuardo.R;
import com.apps.projectakhir.juanlazuardo.projectakhir.AboutActivity;
import com.apps.projectakhir.juanlazuardo.projectakhir.LoginActivity;
import com.apps.projectakhir.juanlazuardo.utils.Preferences;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import static com.apps.projectakhir.juanlazuardo.R.id.card_carrier;
import static com.apps.projectakhir.juanlazuardo.R.id.txt_logout;

public class HomeFragment extends Fragment implements View.OnClickListener {
    TextView txtkeluar,txtName;
    CardView carrier;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //findViewId
        txtkeluar = view.findViewById(txt_logout);
        carrier = view.findViewById(card_carrier);
        txtName = view.findViewById(R.id.txtName);
        //setOnclickListener
        carrier.setOnClickListener(this);
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
            case R.id.card_carrier:
                startActivity(new Intent(getActivity(), AboutActivity.class));
                break;
            default:
                break;
        }
    }
    private void declareView() {
        txtName.setText(Preferences.getRegisteredUser(getActivity().getBaseContext()));
    }
}
