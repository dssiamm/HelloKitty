package com.example.fraps.hellokitty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kitty);
        mText = (TextView)findViewById(R.id.textview);
    }

    public void doSomething(View view) {
        if(mText.getText().equals(getString(R.string.app_name)))
            mText.setText(R.string.app_name1);
        else
            mText.setText(R.string.app_name);
    }
}
