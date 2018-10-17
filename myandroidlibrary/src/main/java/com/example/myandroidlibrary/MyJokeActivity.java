package com.example.myandroidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MyJokeActivity extends AppCompatActivity {

    public static final String JOKE_TEXT = "joke-text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_joke);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        setData();
    }

    private void setData() {
        TextView jokeTextView = findViewById(R.id.tv_joke);

        if (getIntent() != null){
            String joke = getIntent().getStringExtra(JOKE_TEXT);
            jokeTextView.setText(joke);
        }
    }
}
