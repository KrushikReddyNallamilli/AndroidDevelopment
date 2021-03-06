package com.example.navigationcomponents;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FirstFragment extends Fragment {


    public FirstFragment() {
        // Required empty public constructor
    }

    Button b1,b2,b3;


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_first, container, false);
        b1=v.findViewById(R.id.red);
        b2=v.findViewById(R.id.blue);
        b3=v.findViewById(R.id.green);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller= Navigation.findNavController(v);
                controller.navigate(R.id.action_firstFragment_to_redFragment);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller=Navigation.findNavController(v);
                controller.navigate(R.id.action_firstFragment_to_blueFragment);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller=Navigation.findNavController(v);
                controller.navigate(R.id.action_firstFragment_to_greenFragment);

            }
        });

        return v;
    }
}