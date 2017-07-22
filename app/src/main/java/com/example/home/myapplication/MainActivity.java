package com.example.home.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import java.io.File;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Log.d("My tag", "Hello!");

                File folder = new File("/mnt/sdcard/music/");
                File[] listOfFiles = folder.listFiles();

                for (int i = 0; i < listOfFiles.length; i++) {
                    if (listOfFiles[i].isFile()) {
                        Log.d("My tag", "File " + listOfFiles[i].getName());
                    } else if (listOfFiles[i].isDirectory()) {
                        Log.d("My tag", "Directory " + listOfFiles[i].getName());
                    }
                }
            }
        });
    }

}
