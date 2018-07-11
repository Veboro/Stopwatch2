package com.veboro.stopwatch2;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    private int seconds = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
