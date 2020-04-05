package ru.andreysannikov.ravencounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mCrowsCounterButton;
    private int mCount = 0;
    private TextView mHelloText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCrowsCounterButton = findViewById(R.id.button_counter);
        mHelloText = findViewById(R.id.textView);
        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHelloText.setText("Я насчитал " + ++mCount + " Ворон");
            }
        });
    }


    public void onClick(View view) {
        mHelloText.setText("Привет!!");
    }
}
