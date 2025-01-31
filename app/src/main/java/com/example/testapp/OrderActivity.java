package com.example.testapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;

public class OrderActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNav);
        bottomNav.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.nav_home) {
                    startActivity(new Intent(OrderActivity.this, MainActivity.class));
                    finish();
                    return true;
                } else if (itemId == R.id.nav_menu) {
                    startActivity(new Intent(OrderActivity.this, MenuActivity.class));
                    finish();
                    return true;
                } else if (itemId == R.id.nav_order) {
                    return true;
                } else if (itemId == R.id.nav_cart) {
                    startActivity(new Intent(OrderActivity.this, CartActivity.class));
                    finish();
                    return true;
                }
                return false;
            }
        });

        bottomNav.setSelectedItemId(R.id.nav_order);
    }
}
