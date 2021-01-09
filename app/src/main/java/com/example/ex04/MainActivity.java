package com.example.ex04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;

    int clickedNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);

        clickedNum = 0;
    }

    public void inc(View view) {
        clickedNum++;

        if (clickedNum % 7 != 0)
        {
            btn.setText("This is a click number:" + clickedNum);
        }
        else
        {
            btn.setText("BOOM!");
        }
    }
}