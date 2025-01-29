package com.example.testapp;

import android.app.Activity;
import android.os.Bundle;

public class MenuActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu); // En supposant que vous ayez un fichier de mise en page nommé activity_menu.xml
    }
}