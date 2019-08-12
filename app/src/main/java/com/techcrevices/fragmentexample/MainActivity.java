package com.techcrevices.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ChangeFragment(View view) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FragmentOne fragmentOne = new FragmentOne();
        fragmentTransaction.add(R.id.fragment, fragmentOne);
        fragmentTransaction.commit();


    }

    public void ChangeFragment2(View view) {

        Bundle bundleData = new Bundle();
        bundleData.putString("data","ok");

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentTwo fragmentTwo = new FragmentTwo();
        fragmentTwo.setArguments(bundleData);
        fragmentTransaction.add(R.id.fragment2,fragmentTwo);
        fragmentTransaction.commit();


    }
}
