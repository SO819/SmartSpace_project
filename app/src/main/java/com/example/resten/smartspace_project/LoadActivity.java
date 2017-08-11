package com.example.resten.smartspace_project;

/**
 * Created by Resten on 2017-08-09.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Window;


public class LoadActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.load_xml);

    }

}
