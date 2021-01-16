package com.example.caculatorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    float mValueOne, mValueTwo;

    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tvShow);
    }

    public void button1(View view) {
        tv.setText(tv.getText() + "1");
    }

    public void button2(View view) {
        tv.setText(tv.getText() + "2");
    }

    public void button3(View view) {
        tv.setText(tv.getText() + "3");
    }

    public void buttonCong(View view) {
        if (tv == null) {
            tv.setText("");
        } else {
            mValueOne = Float.parseFloat(tv.getText() + "");
            crunchifyAddition = true;
            tv.setText(null);
        }
    }

    public void button4(View view) {
        tv.setText(tv.getText() + "4");
    }

    public void button5(View view) {
        tv.setText(tv.getText() + "5");
    }

    public void button6(View view) {
        tv.setText(tv.getText() + "6");
    }

    public void buttonTru(View view) {
        mValueOne = Float.parseFloat(tv.getText() + "");
        mSubtract = true;
        tv.setText(null);
    }

    public void button7(View view) {
        tv.setText(tv.getText() + "7");
    }

    public void button8(View view) {
        tv.setText(tv.getText() + "8");
    }

    public void button9(View view) {
        tv.setText(tv.getText() + "9");
    }

    public void buttonNhan(View view) {
        mValueOne = Float.parseFloat(tv.getText() + "");
        crunchifyMultiplication = true;
        tv.setText(null);
    }

    public void buttonReset(View view) {
        tv.setText("");
    }

    public void button0(View view) {
        tv.setText(tv.getText() + "0");
    }

    public void buttonBang(View view) {
        mValueTwo = Float.parseFloat(tv.getText() + "");

        if (crunchifyAddition == true) {
            tv.setText(mValueOne + mValueTwo + "");
            crunchifyAddition = false;
        }

        if (mSubtract == true) {
            tv.setText(mValueOne - mValueTwo + "");
            mSubtract = false;
        }

        if (crunchifyMultiplication == true) {
            tv.setText(mValueOne * mValueTwo + "");
            crunchifyMultiplication = false;
        }

        if (crunchifyDivision == true) {
            tv.setText(mValueOne / mValueTwo + "");
            crunchifyDivision = false;
        }
    }

    public void buttonChia(View view) {
        mValueOne = Float.parseFloat(tv.getText() + "");
        crunchifyDivision = true;
        tv.setText(null);
    }
}