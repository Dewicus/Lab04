package com.example.cjd38.lab04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
 * Lab 5 for cs 262
 *
 * @author: Cameron Dewey
 * @version 1 10-27-2016
 */

public class harambeIsBae extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harambe_is_bae);
        //set the title on this page
        setTitle("Lab 05 - Settings");
        getFragmentManager().beginTransaction().replace(android.R.id.content, new settingsfragment()).commit();
    }
}
