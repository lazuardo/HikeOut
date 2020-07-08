package com.apps.projectakhir.juanlazuardo.projectakhir;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.apps.projectakhir.juanlazuardo.R;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;


    public SliderAdapter(Context context){

        this.context = context;
    }

    //Arrays
    public int[] slide_images = {
            R.drawable.ic_mountain,
            R.drawable.ic_backpack,
            R.drawable.ic_insurance_policy
    };

    public String[] slide_headings = {
            "WELCOME TO HIKEOUT",
            "WE PROVIDE WHAT YOU NEED",
            "FULL EQUIPMENT, SAVE LIFE"
    };

    public String[] slide_descs = {
            "Hi There, Welcome To HikeOut. All in Here is About Outdoor Equipment. I Hope You Enjoy This Apps, Thanks.",
            "All Of Information About Outdoor Equipment",
            "Complete What You Need For Your Safety"
    };

    @Override
    public int getCount() {
        return slide_headings.length;

    }

    @Override
    public boolean isViewFromObject(View view,Object o) {

        return view == (ConstraintLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_headings);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_descs[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);
    }

}
