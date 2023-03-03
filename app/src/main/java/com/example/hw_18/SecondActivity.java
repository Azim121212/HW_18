package com.example.hw_18;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class SecondActivity extends AppCompatActivity {
    public MaterialButton btnExport;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnExport = findViewById(R.id.btn_export);
        textView = findViewById(R.id.tv_curretn);
    }

    @Override
    protected void onStart() {
        super.onStart();
        btnExport.setOnClickListener(v -> {
            finishAffinity();
        });
        textView.setText(getIntent().getStringExtra("result"));
    }
}