package com.example.anil.salary;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);


        final EditText e1 = (EditText) findViewById(R.id.et1);
        final EditText e2 = (EditText) findViewById(R.id.et2);
        final EditText e3 = (EditText) findViewById(R.id.et3);
        final EditText e4 = (EditText) findViewById(R.id.et4);
        final EditText e6 = (EditText) findViewById(R.id.et6);
        final Button bt1 = (Button) findViewById(R.id.bt1);
        final Button bt2 = (Button) findViewById(R.id.bt2);

        final TextView t = (TextView) findViewById(R.id.tv1);
        final TextView t1 = (TextView) findViewById(R.id.tv2);
        final TextView t2 = (TextView) findViewById(R.id.tv3);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Float a, b, c, d, f, perday, perhour, damt, tamt, totalamt, finalamt;
                a = Float.parseFloat(e1.getText().toString());
                b = Float.parseFloat(e2.getText().toString());
                c = Float.parseFloat(e3.getText().toString());
                d = Float.parseFloat(e4.getText().toString());
                f = Float.parseFloat(e6.getText().toString());

                perday = c / f;
                perhour = perday / 8;
                damt = perday * a;
                tamt = perhour * b;
                totalamt = damt + tamt;
                finalamt = Float.valueOf(Math.round(totalamt - d));
                //Toast.makeText(getBaseContext(), "Your salary is" + finalamt + " for your work",
                //Toast.LENGTH_SHORT).show();
                t2.setText("Duty amount=" + damt.toString());
                t1.setText("Time amount=" + tamt.toString());
                t.setText("Total amount=" + finalamt.toString());


            }


        });
        bt2.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       e1.setText("");
                                       e6.setText("");
                                       e2.setText("");
                                       e3.setText("");
                                       e4.setText("");
                                       t.setText("");
                                       t1.setText("");
                                       t2.setText("");

                                   }
                               }
        );
    }




        }


