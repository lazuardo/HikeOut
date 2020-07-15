package com.apps.projectakhir.juanlazuardo.projectakhir;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.apps.projectakhir.juanlazuardo.R;
import com.apps.projectakhir.juanlazuardo.fragment.AboutFragment;
import com.apps.projectakhir.juanlazuardo.fragment.HomeFragment;
import com.apps.projectakhir.juanlazuardo.fragment.LocationFragment;
import com.apps.projectakhir.juanlazuardo.utils.Preferences;
import com.google.android.material.bottomnavigation.BottomNavigationView;

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
    09 Juli 2020    : - Membuat ViewPager dengan nama WalktroughActivity dengan sharedPreferences
                      - Merubah Desain Icon Aplikasi
    15 Juli 2020    : - Menambah CardView pada MainActivity
                      - Menambah Bottom Navigation
*/

public class MainActivity extends AppCompatActivity {

    private TextView txtKeluar;
    private TextView txtName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // kita set default nya Home Fragment
        loadFragment(new HomeFragment());
        // inisialisasi BottomNavigaionView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_main);
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.home_menu:
                        fragment = new HomeFragment();
                        break;
                    case R.id.location_menu:
                        fragment = new LocationFragment();
                        break;
                    case R.id.about_menu:
                        fragment = new AboutFragment();
                        break;
                }
                return loadFragment(fragment);
            }
        });

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

    // method untuk load fragment yang sesuai
    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container_home, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    private void declareView() {
        txtKeluar = findViewById(R.id.txt_logout);
        txtName = findViewById(R.id.txtName);

        txtName.setText(Preferences.getRegisteredUser(getBaseContext()));
    }
}

