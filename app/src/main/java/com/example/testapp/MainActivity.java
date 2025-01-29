package com.example.testapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Récupérer le menu de navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);

        // Ajouter un listener pour détecter les clics
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.nav_home) {
                    startActivity(new Intent(MainActivity.this, MainActivity.class));
                    return true;
                } else if (itemId == R.id.nav_menu) {
                    startActivity(new Intent(MainActivity.this, MenuActivity.class));
                    return true;
                } else if (itemId == R.id.nav_order) {
                    startActivity(new Intent(MainActivity.this, OrderActivity.class));
                    return true;
                } else if (itemId == R.id.nav_cart) {
                    startActivity(new Intent(MainActivity.this, CartActivity.class));
                    return true;
                }
                return false;
            }
        });
    }
}