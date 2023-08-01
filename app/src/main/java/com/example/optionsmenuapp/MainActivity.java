package com.example.optionsmenuapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
FrameLayout container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container = (FrameLayout) findViewById(R.id.container);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.profile) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, new ProfileFragment()).commit();
        } else if (itemId == R.id.settings) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, new SettingsFragment()).commit();
        }
        return super.onOptionsItemSelected(item);
    }
}