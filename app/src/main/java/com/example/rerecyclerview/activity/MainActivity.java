package com.example.rerecyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rerecyclerview.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Button button = findViewById(R.id.button);
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSecondActivity();
            }
        } );
    }
    public void showSecondActivity()
    {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
