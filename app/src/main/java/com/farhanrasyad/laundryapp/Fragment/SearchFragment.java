package com.farhanrasyad.laundryapp.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.farhanrasyad.laundryapp.R;
import com.farhanrasyad.laundryapp.adapter.SearchAdapter;
import com.farhanrasyad.laundryapp.model.Search;

import java.util.ArrayList;
import java.util.List;


public class SearchFragment extends Fragment {

    RecyclerView recyclerView;
    Context mContext;
    SearchAdapter adapter;
    List<Search> list;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mContext = getContext(); // Initialize mContext with the Fragment's context

        initView(view);
        setAdapter();
    }

    private void initView(View view) {
        recyclerView = view.findViewById(R.id.location_search_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext,
                LinearLayoutManager.HORIZONTAL, false));

        recyclerView.setHasFixedSize(true);
    }

    private void setAdapter() {
        initModel();

        adapter = new SearchAdapter(mContext,list);
        recyclerView.setAdapter(adapter);
    }

    private void initModel() {
        list = new ArrayList<>();

        list.add(new Search(R.drawable.ic_laundry, "GlitterGLow Laundry", "4.5", "3.2km"));
        list.add(new Search(R.drawable.ic_laundry, "GlitterGLow Laundry", "4.0", "1.0km"));
        list.add(new Search(R.drawable.ic_laundry, "GlitterGLow Laundry", "4.8", "250m"));
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        // You can perform additional actions when fragment is attached to its hosting activity.
    }
}