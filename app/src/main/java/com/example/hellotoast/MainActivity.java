package com.example.hellotoast;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    //mamamamamasmsmasmsamasmasmmsaasmasmsamasmas
    //asdasaads

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = findViewById(R.id.show_count);
    }


    public void countUp(View view) {

        if (mShowCount != null ){

            mCount++;
            mShowCount.setText(Integer.toString(mCount));

        }
    }

    public void showToast(View view) {

        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, R.string.toast_message, Toast.LENGTH_LONG);
        toast.show();

    }
}
