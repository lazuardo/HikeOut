package com.apps.projectakhir.juanlazuardo.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.projectakhir.juanlazuardo.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class AboutFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Element versionElement = new Element();
        versionElement.setTitle("Version 1.0");
        return  new AboutPage(getContext())
                .isRTL(false)
                .enableDarkMode(false)
                .setDescription("HikeOut")
                .setImage(R.drawable.about_hikout)
                .addItem(versionElement)
                .addGroup("Connect with me")
                .addEmail("lazuardojuant@gmail.com","Email")
                .addWebsite("https://juanlazuardo.wordpress.com/","My Wbsite")
                .addTwitter("buciiiiin","My Twitter")
                .addYoutube("https://www.youtube.com/channel/UC0xZKgVy6kota4E7TLinEZw","Youtube Channel")
                .addGitHub("lazuardo","Github")
                .addInstagram("juanlazuardo","Instagram")
                .addItem(getCopyRightsElement())
                .addItem(new Element())
                .create();
    }

    Element getCopyRightsElement() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.copy_right), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setAutoApplyIconTint(true);
        copyRightsElement.setIconTint(mehdi.sakout.aboutpage.R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.CENTER);
        return copyRightsElement;
    }

}
