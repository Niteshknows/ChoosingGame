package com.example.choosinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class RankActivity extends AppCompatActivity {
 TextView value1,value2,value3,value4,value5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank);

        Bundle extras = getIntent().getExtras();
        int[] ArrayB = extras.getIntArray("points");

        value1 = findViewById(R.id.value1);
        value2 = findViewById(R.id.value2);
        value3 = findViewById(R.id.value3);
        value4 = findViewById(R.id.value4);
        value5 = findViewById(R.id.value5);


        setTextValue(value1,ArrayB[0]);
        setTextValue(value2,ArrayB[1]);
        setTextValue(value3,ArrayB[2]);
        setTextValue(value4,ArrayB[3]);
        setTextValue(value5,ArrayB[4]);




    }

@Override
public void onBackPressed() {
        finishAffinity();
}
    private void setTextValue(TextView value, int i) {
        switch(i) {
            case 0:
                value.setText("Not At all Important");
                break;

                case 1:
                    value.setText("Less important");
                    break;
            case 2:
                value.setText("Somewhat Important");
                break;
            case 3:
                value.setText("Very Important");
                break;
            case 4:
                value.setText("Extremely Important");
                break;
        }
    }
}