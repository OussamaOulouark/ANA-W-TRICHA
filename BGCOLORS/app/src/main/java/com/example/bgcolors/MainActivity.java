package com.example.bgcolors;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button BTN1,BTN2,BTN3 ,BTN4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BTN1 = findViewById(R.id.BTN1);
        BTN2 = findViewById(R.id.BTN2);
        BTN3 = findViewById(R.id.BTN3);
        BTN4= findViewById(R.id.BTN4);
       


        //METHOD1

        /*

        BTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getWindow().getDecorView().setBackgroundColor(Color.RED);
            }
        });

        BTN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getWindow().getDecorView().setBackgroundColor(Color.BLUE);
            }
        });

        BTN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
            }
        }); */

        //HADO ZADHOM MN 3NDI BACH NBAFAL LON TA3 BUTTON
        BTN4.setBackgroundColor(getResources().getColor(R.color.GREEN));
        BTN1.setBackgroundColor(getResources().getColor(R.color.RED));
        BTN2.setBackgroundColor(getResources().getColor(R.color.BLEU));
        BTN3.setBackgroundColor(getResources().getColor(R.color.YELLOW));
    }



    public void Changebgcolor(View view){
        Button btn = (Button) view;
        if (btn.equals(BTN1))
            getWindow().getDecorView().setBackgroundColor(Color.RED);
        else if (btn.equals(BTN2))
            getWindow().getDecorView().setBackgroundColor(Color.BLUE);
        else if (btn.equals(BTN3))
            getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
        
    }
}