package com.example.javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

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
        File file = new File("../sdcard/Android/1.txt");
//        String fileContent = GetSDCardFile.getFileContent(file);
        String fileContent = GetSDCardFile.readTxt("../sdcard/Android/");
        Log.i("get file", "文件内容为：" + fileContent);
    }
}