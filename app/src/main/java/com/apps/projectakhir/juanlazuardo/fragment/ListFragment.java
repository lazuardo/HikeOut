package com.apps.projectakhir.juanlazuardo.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.apps.projectakhir.juanlazuardo.R;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.apps.projectakhir.juanlazuardo.adapter.ListAdapter;


public class ListFragment extends Fragment{

    RecyclerView recyclerView;
    String s1[];
    int images[] = {R.drawable.ic_people2,R.drawable.ic_people2,R.drawable.ic_people2,R.drawable.ic_people2, R.drawable.ic_people2,
            R.drawable.ic_people2,R.drawable.ic_people2,R.drawable.ic_people2,R.drawable.ic_people2,R.drawable.ic_people2};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        recyclerView = view.findViewById(R.id.recycleViewProduct);

        s1 = getResources().getStringArray(R.array.MusicTitle);
        ListAdapter myAdapter = new ListAdapter(getContext(),s1, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;

    }
}
