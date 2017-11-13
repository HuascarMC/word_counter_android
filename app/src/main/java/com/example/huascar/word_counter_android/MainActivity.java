package com.example.huascar.word_counter_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView editText;
    private Button count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editText = (TextView) findViewById(R.id.editText);
        this.count = (Button) findViewById(R.id.count);
    }

    public void onClick(View button) {
        Log.d("MainActivity", "onClick");
        String[] sentence = this.editText.getText().toString().split(" ");
        int amount = sentence.length;
        String amountToString = Integer.toString(amount);
        this.editText.setText(amountToString);
    }
}
