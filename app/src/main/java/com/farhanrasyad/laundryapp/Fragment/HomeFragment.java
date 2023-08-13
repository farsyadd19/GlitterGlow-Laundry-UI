package com.farhanrasyad.laundryapp.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.farhanrasyad.laundryapp.HomeDetailActivity;
import com.farhanrasyad.laundryapp.R;
import com.farhanrasyad.laundryapp.adapter.HomeAdapter;
import com.farhanrasyad.laundryapp.model.Item;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements View.OnClickListener {
    RecyclerView recyclerView;
    Context mContext;
    HomeAdapter adapter;
    List<Item> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mContext = getContext(); // Initialize mContext with the Fragment's context

        initView(view);
        setAdapter();
    }

    private void initView(View view) {
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext,
                LinearLayoutManager.HORIZONTAL, false));

        recyclerView.setHasFixedSize(true);

        // Temukan ImageView image_2 dalam tata letak
        ImageView image_2 = view.findViewById(R.id.image_2);

        // Atur pendengar onClick untuk ImageView image_2
        image_2.setOnClickListener(this);
    }

    private void setAdapter() {
        initModel();

        adapter = new HomeAdapter(mContext, list);
        recyclerView.setAdapter(adapter);
    }

    private void initModel() {
        list = new ArrayList<>();

        list.add(new Item(R.drawable.ic_cosmetic, "GlitterGlow Beauty and Cosmetics"));
        list.add(new Item(R.drawable.ic_fashion, "GlitterGlow Fashion and Accessories"));
        list.add(new Item(R.drawable.ic_jewelry, "GlitterGlow Jewelry"));
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.image_2) {
            Intent intent = new Intent(mContext, HomeDetailActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }
}

















