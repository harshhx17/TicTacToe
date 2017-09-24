package com.example.harshkumarbhartiya.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
int flag=1;
    protected void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.singleplayer:
                if (checked)
                {flag=1;}


                    break;
            case R.id.multiplayer:
                if (checked)
                {flag=2;}
                break;
        }


    }
    protected void playbutton(View view)
    {if (flag==1)
    {Intent i= new Intent(this, Main3Activity.class);

    startActivity(i);}
    else if (flag==2)
    {Intent i= new Intent(this, Main2Activity.class);

    startActivity(i); }
}}
