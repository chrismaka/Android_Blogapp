package com.example.chris.myapplication;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyAlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getContext())
                // set dialog icon
                .setIcon(R.drawable.emo)
                // set Dialog Title
                .setTitle("We Believe in Dreams")
                // Set Dialog Message
                .setMessage("Share a dream/a success/a failure and brighten someone's day.Or brighten your day through other's stories")

                // positive button
                .setPositiveButton("NOT INTERESTED", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        getActivity().finish();
                    }
                })
                // negative button
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(), "Swipe to Stories", Toast.LENGTH_SHORT).show();
                    }
                }).create();

}}
