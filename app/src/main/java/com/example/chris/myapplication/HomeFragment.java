package com.example.chris.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    Button button;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FrameLayout layout = (FrameLayout)inflater.inflate(R.layout.fragment_home, container, false);
        button = (Button)layout.findViewById(R.id.button2);
        // Inflate the layout for this fragment
        button.setOnClickListener(this);
        return layout;
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        // Create and show the dialog.
        MyAlertDialogFragment newFragment = new MyAlertDialogFragment();
        newFragment.show(ft, "dialog");
    }
}
