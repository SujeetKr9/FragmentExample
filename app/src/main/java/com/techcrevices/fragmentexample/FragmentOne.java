package com.techcrevices.fragmentexample;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class FragmentOne extends Fragment {
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

       v = inflater.inflate(R.layout.fragment_fragment_one, container, false);




        ((Button)v.findViewById(R.id.btn1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText edit1 = (EditText)v.findViewById(R.id.edit1);
                String edit1Sr = edit1.getText().toString();

                final Bundle bundleData = new Bundle();
                bundleData.putString("data",edit1Sr);


                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                FragmentTwo fragmentTwo = new FragmentTwo();
                fragmentTwo.setArguments(bundleData);

                fragmentTransaction.add(R.id.fragment2,fragmentTwo);
                fragmentTransaction.commit();

            }
        });

        return v;



    }



}
