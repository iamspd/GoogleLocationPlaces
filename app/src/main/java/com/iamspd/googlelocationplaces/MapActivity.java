package com.iamspd.googlelocationplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MapActivity extends AppCompatActivity {

    // variables
    private static final String TAG = "MapActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }
}