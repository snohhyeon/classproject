package com.cookandroid.gym_machine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CountActivity extends AppCompatActivity {
    TextView textView;
    Button startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        textView = findViewById(R.id.textView);
        startBtn = (Button)findViewById(R.id.startBtn);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CountDownTimer countDownTimer = new CountDownTimer(30000, 1000) {
                    public void onTick(long millisUntilFinished) {
                        int num = (int) (millisUntilFinished / 1000);
                        textView.setText(Integer.toString(num + 1));
                    }

                    public void onFinish() {
                        textView.setText("끝");
                    }
                }.start();
            }
        });
    }
}