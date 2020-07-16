package com.esinik.terra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.esinik.mylib.TestClass;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestClass testClass = new TestClass();

        testClass.printHello();
    }
}