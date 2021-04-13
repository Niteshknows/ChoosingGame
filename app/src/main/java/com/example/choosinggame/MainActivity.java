package com.example.choosinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Integer point_1=0, point_2=0, point_3=0, point_4=0, point_5=0;
    RadioGroup rg1, rg2, rg3,rg4,rg5,rg6,rg7,rg8,rg9,rg10;
    Button Submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg1 = findViewById(R.id.rg1);
        rg2 = findViewById(R.id.rg2);
        rg3 = findViewById(R.id.rg3);
        rg4 = findViewById(R.id.rg4);
        rg5 = findViewById(R.id.rg5);
        rg6 = findViewById(R.id.rg6);
        rg7 = findViewById(R.id.rg7);
        rg8 = findViewById(R.id.rg8);
        rg9 = findViewById(R.id.rg9);
        rg10 = findViewById(R.id.rg10);

        Submit = findViewById(R.id.submitBtn);

        rg1.clearCheck();
        rg2.clearCheck();
        rg3.clearCheck();
        rg4.clearCheck();
        rg5.clearCheck();
        rg6.clearCheck();
        rg7.clearCheck();
        rg8.clearCheck();
        rg9.clearCheck();
        rg10.clearCheck();

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selection1 = rg1.getCheckedRadioButtonId();
                int selection2 = rg2.getCheckedRadioButtonId();
                int selection3 = rg3.getCheckedRadioButtonId();
                int selection4 = rg4.getCheckedRadioButtonId();
                int selection5 = rg5.getCheckedRadioButtonId();
                int selection6 = rg6.getCheckedRadioButtonId();
                int selection7 = rg7.getCheckedRadioButtonId();
                int selection8 = rg8.getCheckedRadioButtonId();
                int selection9 = rg9.getCheckedRadioButtonId();
                int selection10 = rg10.getCheckedRadioButtonId();

                if (selection1 == -1 ||selection2 == -1 || selection3 == -1 || selection4 == -1
                        || selection5 == -1|| selection6 == -1|| selection7 == -1|| selection8 == -1
                        || selection9 == -1|| selection10 == -1) {
                    Toast.makeText(MainActivity.this,
                            "Select one option for every case",
                            Toast.LENGTH_SHORT)
                            .show();
                } else {
                    findRadioButton1(selection1);
                    findRadioButton2(selection2);
                    findRadioButton3(selection3);
                    findRadioButton4(selection4);
                    findRadioButton5(selection5);
                    findRadioButton6(selection6);
                    findRadioButton7(selection7);
                    findRadioButton8(selection8);
                    findRadioButton9(selection9);
                    findRadioButton10(selection10);

                    int ptArray[] = new int[]{point_1,point_2,point_3,point_4,point_5};

                    Intent i = new Intent(MainActivity.this, RankActivity.class);
                    i.putExtra("points",ptArray);
                    startActivity(i);
                }
            }
        });
    }


    private void findRadioButton10(int selection10) {
        switch (selection10) {
            case R.id.rb10_1:
                point_4++;
                break;
            case R.id.rb10_2:
                point_5++;
                break;
        }
    }

    private void findRadioButton9(int selection9) {
        switch (selection9) {
            case R.id.rb9_1:
                point_3++;
                break;
            case R.id.rb9_2:
                point_5++;
                break;
        }
    }

    private void findRadioButton8(int selection8) {
        switch (selection8) {
            case R.id.rb8_1:
                point_3++;
                break;
            case R.id.rb8_2:
                point_4++;
                break;
        }
    }

    private void findRadioButton7(int selection7) {
        switch (selection7) {
            case R.id.rb7_1:
                point_2++;
                break;
            case R.id.rb7_2:
                point_5++;
                break;
        }

    }

    private void findRadioButton6(int selection6) {
        switch (selection6) {
            case R.id.rb6_1:
                point_2++;
                break;
            case R.id.rb6_2:
                point_4++;
                break;
        }

    }

    private void findRadioButton5(int selection5) {
        switch (selection5) {
            case R.id.rb5_1:
                point_2++;
                break;
            case R.id.rb5_2:
                point_3++;
                break;
        }
    }

    private void findRadioButton4(int selection4) {
        switch (selection4) {
            case R.id.rb4_1:
                point_1++;
                break;
            case R.id.rb4_2:
                point_5++;
                break;
        }
    }

    private void findRadioButton3(int selection3) {

        switch (selection3) {
            case R.id.rb3_1:
                point_1++;
                break;
            case R.id.rb3_2:
                point_4++;
                break;
       }
    }

    private void findRadioButton2(int selection2) {
        switch (selection2) {
            case R.id.rb2_1:
                point_1++;
                break;
            case R.id.rb2_2:
                point_3++;
                break;

        }
    }

    private void findRadioButton1(int selection1) {
    switch (selection1) {
        case R.id.rb1_1:
            point_1++;
            break;
        case R.id.rb1_2:
            point_2++;
            break;
        }
    }
}