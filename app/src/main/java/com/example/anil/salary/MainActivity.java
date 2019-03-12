package com.example.anil.salary;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.name;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button b1;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.img);

        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i8 = new Intent(MainActivity.this, ScrollingActivity.class);
        startActivity(i8);
    }
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menus, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.id1:
                Intent i4 = new Intent(MainActivity.this, Main5Activity.class);
                startActivity(i4);
                return true;
            case R.id.id21:
                Intent i1 = new Intent(MainActivity.this, Main6Activity.class);
                startActivity(i1);
                return true;
            case R.id.id3:
                Intent i3 = new Intent(MainActivity.this, Main8Activity.class);
                startActivity(i3);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

}






