package com.purdue.helloworld.ui.main;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.purdue.helloworld.HoursAdapter;
import com.purdue.helloworld.R;
import com.purdue.helloworld.Utility;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {
    static String timeNow = "-";
    static String menuNow = "-";

RecyclerView recyclerView;
    private static final String ARG_SECTION_NUMBER = "section_number";
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_main, container, false);
        recyclerView = root.findViewById(R.id.rvHours);


        Bundle bundle2 = this.getArguments();
        // System.out.println(bundle2);

        // System.out.println(bundle2.getString("time"));

        if (bundle2 != null) {
            String time = bundle2.getString("time");
            String menu = bundle2.getString("menu");
        }

        HoursAdapter hoursAdapter = new HoursAdapter(Utility.parseString(timeNow));
        hoursAdapter.notifyDataSetChanged();
        RecyclerView.LayoutManager layoutmanager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutmanager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(hoursAdapter);


        return root;
    }
}