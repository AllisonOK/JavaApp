package com.example.javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.javaapp.sdcard.GetSDCardFile;
import com.example.javaapp.thread.JoinThread;
import com.example.javaapp.thread.JoinThread2;
import com.example.javaapp.thread.YieldThread;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, BuildConfig.BASE_URL, Toast.LENGTH_SHORT).show();
    }
}