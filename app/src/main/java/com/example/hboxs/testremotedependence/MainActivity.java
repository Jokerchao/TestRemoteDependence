package com.example.hboxs.testremotedependence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.hboxs.testremotelibrary.HelloUtil;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityHello";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String hello = HelloUtil.getHello();
        Log.d(TAG,hello);
    }
}
