package com.example.loginuserapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView textView1 = findViewById(R.id.tvDisplay1);
        TextView textView2 = findViewById(R.id.tvDisplay2);
        TextView textView3= findViewById(R.id.tvDisplay3);
        TextView textView4 = findViewById(R.id.tvDisplay4);
        TextView textView5 = findViewById(R.id.tvDisplay5);
        TextView textView6 = findViewById(R.id.tvDisplay6);
        TextView textView7 = findViewById(R.id.tvDisplay7);

        textView1.setText(getIntent().getExtras().getString("str_key1"));
        textView2.setText(getIntent().getExtras().getString("str_key2"));
        textView3.setText(getIntent().getExtras().getString("str_key3"));
        textView4.setText(getIntent().getExtras().getString("str_key4"));
        textView5.setText(getIntent().getExtras().getString("str_key5"));
        textView6.setText(getIntent().getExtras().getString("str_key6"));
        textView7.setText(String.valueOf(getIntent().getExtras().getBoolean("boll")));
    }
}
