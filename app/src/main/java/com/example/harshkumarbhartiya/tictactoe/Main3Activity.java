package com.example.harshkumarbhartiya.tictactoe;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);}
 int f=0;
    int[] a= new int[9];
protected void on1(View view){
    buttonclick(0, 1);
    computerchance();
    }
    protected void on2(View view){
        buttonclick(1, 1);
        computerchance();
    }
    protected void on3(View view){
        buttonclick(2, 1);
        computerchance();
    }
    protected void on4(View view){
        buttonclick(3, 1);
        computerchance();
    }
    protected void on5(View view){
        buttonclick(4, 1);
        computerchance();
    }
    protected void on6(View view){
        buttonclick(5, 1);
        computerchance();
    }
    protected void on7(View view){
        buttonclick(6, 1);
        computerchance();
    }
    protected void on8(View view){
        buttonclick(7, 1);
        computerchance();
    }
    protected void on9(View view){
        buttonclick(8, 1);
        computerchance();
    }

    protected void computerchance(){
        if(a[0]==0||a[1]==0||a[2]==0||a[3]==0||a[4]==0||a[5]==0||a[6]==0||a[7]==0||a[8]==0) {
            Random rn = new Random();
            int i = rn.nextInt(8);
            if (a[i] == 0) {
                buttonclick(i, 2);


            } else {
                computerchance();
            }
        }    }
    protected void buttonclick(int l, int m) {
        Button buttn1 = (Button) findViewById(R.id.button1);
        Button buttn9 = (Button) findViewById(R.id.button9);
        Button buttn4 = (Button) findViewById(R.id.button4);
        Button buttn2 = (Button) findViewById(R.id.button2);
        Button buttn3 = (Button) findViewById(R.id.button3);
        Button buttn5 = (Button) findViewById(R.id.button5);
        Button buttn6 = (Button) findViewById(R.id.button6);
        Button buttn7 = (Button) findViewById(R.id.button7);
        Button buttn8 = (Button) findViewById(R.id.button8);
        if (f == 0) {
            if (m == 1) {
                switch (l) {
                    case 0:
                        buttn1.setBackgroundResource(R.drawable.o);
                        a[l] = 1;
                        break;
                    case 1:
                        buttn2.setBackgroundResource(R.drawable.o);
                        a[l] = 1;
                        break;
                    case 2:
                        buttn3.setBackgroundResource(R.drawable.o);
                        a[l] = 1;
                        break;
                    case 3:
                        buttn4.setBackgroundResource(R.drawable.o);
                        a[l] = 1;
                        break;
                    case 4:
                        buttn5.setBackgroundResource(R.drawable.o);
                        a[l] = 1;
                        break;
                    case 5:
                        buttn6.setBackgroundResource(R.drawable.o);
                        a[l] = 1;
                        break;
                    case 6:
                        buttn7.setBackgroundResource(R.drawable.o);
                        a[l] = 1;
                        break;
                    case 7:
                        buttn8.setBackgroundResource(R.drawable.o);
                        a[l] = 1;
                        break;
                    case 8:
                        buttn9.setBackgroundResource(R.drawable.o);
                        a[l] = 1;
                        break;
                }
            } else if (m == 2) {
                switch (l) {
                    case 0:
                        buttn1.setBackgroundResource(R.drawable.x);
                        a[l] = 2;
                        break;
                    case 1:
                        buttn2.setBackgroundResource(R.drawable.x);
                        a[l] = 2;
                        break;
                    case 2:
                        buttn3.setBackgroundResource(R.drawable.x);
                        a[l] = 2;
                        break;
                    case 3:
                        buttn4.setBackgroundResource(R.drawable.x);
                        a[l] = 2;
                        break;
                    case 4:
                        buttn5.setBackgroundResource(R.drawable.x);
                        a[l] = 2;
                        break;
                    case 5:
                        buttn6.setBackgroundResource(R.drawable.x);
                        a[l] = 2;
                        break;
                    case 6:
                        buttn7.setBackgroundResource(R.drawable.x);
                        a[l] = 2;
                        break;
                    case 7:
                        buttn8.setBackgroundResource(R.drawable.x);
                        a[l] = 2;
                        break;
                    case 8:
                        buttn9.setBackgroundResource(R.drawable.x);
                        a[l] = 2;
                        break;

                }}
                check();

        }
    }    protected void check()
    {if(a[0]==a[1]&&a[1]==a[2]&&a[0]!=0)
    {drawLine(1, a[0]);
    }
        if(a[3]==a[4]&&a[4]==a[5]&&a[3]!=0)
        {drawLine(2, a[3]);
        }
        else if(a[6]==a[7]&&a[7]==a[8]&&a[6]!=0)
        {drawLine(3, a[6]);
        }
        else if(a[0]==a[3]&&a[3]==a[6]&&a[0]!=0)
        {drawLine(4, a[0]);
        }
        else if(a[1]==a[4]&&a[4]==a[7]&&a[4]!=0)
        {drawLine(5, a[1]);
        }
        else if(a[2]==a[5]&&a[5]==a[8]&&a[5]!=0)
        {drawLine(6, a[2]);
        }
        else if(a[0]==a[4]&&a[4]==a[8]&&a[8]!=0)
        {drawLine(7, a[0]);
        }
        else if(a[2]==a[4]&&a[4]==a[6]&&a[4]!=0)
        {drawLine(8, a[2]);
        }
else if(!(a[0]==0||a[1]==0||a[2]==0||a[3]==0||a[4]==0||a[5]==0||a[6]==0||a[7]==0||a[8]==0))
{TextView text = (TextView)findViewById(R.id.textView);
    text.setText("Game Is TIE!");
    text.setTextSize(35);
    text.setTextColor(Color.RED);
    View lay = findViewById(R.id.layou);
    lay.setBackgroundColor(Color.CYAN);


}   }
    public  void drawLine(int line, int player)
    {
        f=1;
        Button buttn1 = (Button) findViewById(R.id.button1);
        Button buttn9 = (Button) findViewById(R.id.button9);
        Button buttn4 = (Button) findViewById(R.id.button4);
        Button buttn2 = (Button) findViewById(R.id.button2);
        Button buttn3 = (Button) findViewById(R.id.button3);
        Button buttn5 = (Button) findViewById(R.id.button5);
        Button buttn6 = (Button) findViewById(R.id.button6);
        Button buttn7 = (Button) findViewById(R.id.button7);
        Button buttn8 = (Button) findViewById(R.id.button8);
        TextView text = (TextView)findViewById(R.id.textView);
        if(player==1)
        {text.setText("O WINS!");
            text.setTextColor(Color.RED);
            View lay = findViewById(R.id.layou);
            lay.setBackgroundColor(Color.CYAN);}
        else if (player==2)
        {text.setText("X WINS!");
            text.setTextColor(Color.RED);
            View lay = findViewById(R.id.layou);
            lay.setBackgroundColor(Color.CYAN);}
        switch(line)
        {
            case 1:buttn1.setBackgroundColor(Color.MAGENTA);
                buttn2.setBackgroundColor(Color.MAGENTA);
                buttn3.setBackgroundColor(Color.MAGENTA);
                break;
            case 2:buttn4.setBackgroundColor(Color.MAGENTA);
                buttn5.setBackgroundColor(Color.MAGENTA);
                buttn6.setBackgroundColor(Color.MAGENTA);
                break;
            case 3:buttn7.setBackgroundColor(Color.MAGENTA);
                buttn8.setBackgroundColor(Color.MAGENTA);
                buttn9.setBackgroundColor(Color.MAGENTA);
                break;
            case 4:buttn1.setBackgroundColor(Color.MAGENTA);
                buttn4.setBackgroundColor(Color.MAGENTA);
                buttn7.setBackgroundColor(Color.MAGENTA);
                break;
            case 5:buttn2.setBackgroundColor(Color.MAGENTA);
                buttn5.setBackgroundColor(Color.MAGENTA);
                buttn8.setBackgroundColor(Color.MAGENTA);
                break;
            case 6:buttn3.setBackgroundColor(Color.MAGENTA);
                buttn6.setBackgroundColor(Color.MAGENTA);
                buttn9.setBackgroundColor(Color.MAGENTA);
                break;
            case 7:
                buttn1.setBackgroundColor(Color.MAGENTA);
                buttn5.setBackgroundColor(Color.MAGENTA);
                buttn9.setBackgroundColor(Color.MAGENTA);break;
            case 8:buttn7.setBackgroundColor(Color.MAGENTA);
                buttn3.setBackgroundColor(Color.MAGENTA);
                buttn5.setBackgroundColor(Color.MAGENTA);break;
        }
    }
    protected void replay(View view)
    {
     recreate();



    }
    protected void menu(View view)
    {
        Intent i= new Intent(this, MainActivity.class);
        startActivity(i);
    }
}