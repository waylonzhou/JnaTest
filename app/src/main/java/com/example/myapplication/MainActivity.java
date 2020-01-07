package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public TextView tx;
    //public static final TestCLibrary INSTANCE = Native.loadLibrary("testC", TestCLibrary.class);
    // public static final TestLibrary INSTANCE = (TestLibrary)Native.loadLibrary("test", TestLibrary.class);
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx = (TextView) findViewById(R.id.tx_value);
        tx.setText("Use jna.arr to generate: " + TestLib.INSTANCE.add(2,3));
        //Log.d("TestCLibrary", "onCreate: "+ TestCLibrary.INSTANCE.getvalue()) ;   }
    }

}