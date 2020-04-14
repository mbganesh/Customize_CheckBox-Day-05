package com.example.customize_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.CellSignalStrength;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       final CheckBox c1 , c2 , c3 ;
       final Button bt ;
       final TextView tv;

        c1 = (CheckBox) findViewById(R.id.first_Checkbox);
        c2 = (CheckBox) findViewById(R.id.second_Checkbox);
        c3 = (CheckBox) findViewById(R.id.third_Checkbox);

        bt = (Button) findViewById(R.id.checkbox_button);

        tv = (TextView) findViewById(R.id.textview_checkbox);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c1.isChecked())
                    c1.setTextSize(35f);
                else
                    c1.setTextSize(25f);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c2.isChecked())
                    c2.setTextSize(35f);
                else
                    c2.setTextSize(25f);
            }
        });


        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c3.isChecked())
                    c3.setTextSize(35f);
                else
                    c3.setTextSize(25f);
            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                if(c1.isChecked())
                {
                    s += "First Box Selected.";
                }
                if(c2.isChecked()){
                    s += "\nSecond Box Selected.";
                }
                if (c3.isChecked()){
                    s += "\nThird Box Selected";
                }
                if (s.endsWith("")){
                    String s1 = "Nothing is Selected....";
                    tv.setText(s1);
                }




            }
        });
    }
}
