package com.apps.projectakhir.juanlazuardo.projectakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.apps.projectakhir.juanlazuardo.R;
import com.apps.projectakhir.juanlazuardo.utils.Preferences;

/*
NIM     : 10117160
Nama    : Juan Lazuardo
Kelas   : IF-4

Update :
    19 Juni 2020    : - Membuat Asset Splash Screen dan MainActivity
    20 Juni 2020    : - Membuat Tampilan Splash Screen dan MainActivity
                      - Upload Github --> First Upload Project

    26 Juni 2020    : - Redesign SplashScreen dan Background MainActivity
    27 Juni 2020    : - Membuat LoginActivity, RegisterActivity dengan shared preferences (sementara)
    03 Juli 2020    : - Membuat Struktur Database dengan phpmyadmin (belum online)
    09 Juli 2022    : - Membuat ViewPager dengan nama WalktroughActivity dengan sharedPreferences
                      - Merubah Desain Icon Aplikasi
*/

public class MainActivity extends AppCompatActivity {

    private TextView txtKeluar;
    private TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        declareView();
        txtKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Clear Set Preferences
                Preferences.setLogout(getBaseContext());

                //Pindah Halaman ke Login
                startActivity(new Intent(getBaseContext(), LoginActivity.class));
                finish();
            }
        });
    }
    private void declareView() {
        txtKeluar = findViewById(R.id.txt_logout);
        txtName = findViewById(R.id.txtName);

        txtName.setText(Preferences.getRegisteredUser(getBaseContext()));
    }
}
