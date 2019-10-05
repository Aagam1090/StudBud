package com.ankita.studbud.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.ankita.studbud.R;
import com.ankita.studbud.Register_Student_Activity;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    ImageView aiMl;
    ImageView android;
    ImageView progLang;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        return root;
    }

   /* @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //get the button view
        aiMl = (ImageView) getView().findViewById(R.id.image1);
        //set a onclick listener for when the button gets clicked
        aiMl.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(), Register_Student_Activity.class);
                startActivity(mainIntent);
            }
        });
    }*/
}