package com.example.nbabwany.mindful;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by nbabwany on 2017-02-09.
 */

public class EntriesFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.entries_layout, container, false);
        TextView tv = (TextView) v.findViewById(R.id.text);
        tv.setText("Entries");
        return v;
    }
}
