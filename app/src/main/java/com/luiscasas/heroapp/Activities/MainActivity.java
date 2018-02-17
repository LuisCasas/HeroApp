package com.luiscasas.heroapp.Activities;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.luiscasas.heroapp.Fragments.MainFragment;
import com.luiscasas.heroapp.Fragments.PickPowerFragment;
import com.luiscasas.heroapp.R;

public class MainActivity extends AppCompatActivity implements MainFragment.MainFragmentInteractionListener, PickPowerFragment.PickPowerFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragment_container);

        if(fragment == null){
            fragment = new MainFragment();
            manager.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }

    public void loadPowerScreen(){

        PickPowerFragment pickPowerFragment = new PickPowerFragment();
       // getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, pickPowerFragment).commit();
        this.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, pickPowerFragment).addToBackStack(null).commit();


    }

    @Override
    public void onMainFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPickPowerFragmentInteraction(Uri uri) {

    }
}
