package com.example.harshkumarbhartiya.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
        int flag=1,i;
    int a[] = new int[9];

    protected void on1(View view)
    {

        Button buttn1 = (Button) findViewById(R.id.button1);
        i = 0;

        if(flag == 1&& a[i]==0)
        {
            a[i] = 1;
            flag =2;
              buttn1.setBackgroundColor(Color.BLUE);

        }
        else if(flag == 2&& a[i]==0)
        {
            a[i] = 2;
            flag = 1;
            buttn1.setBackgroundColor(Color.RED);

        }
        check();
    }protected void on2(View view)
    { Button buttn2 = (Button) findViewById(R.id.button2);
        i = 1;

        if(flag == 1 && a[i]==0)
        {
            a[i] = 1;
            flag =2;
            buttn2.setBackgroundColor(Color.BLUE);

        }
        else if(flag == 2&& a[i]==0)
        {
            a[i] = 2;
            flag = 1;
            buttn2.setBackgroundColor(Color.RED);

        }
        check();
    }protected void on3(View view)
    {
        Button buttn3 = (Button) findViewById(R.id.button3);
        i = 2;

        if(flag == 1 && a[i]==0)
        {
            a[i] = 1;
            flag =2;
            buttn3.setBackgroundColor(Color.BLUE);

        }
        else if(flag == 2&& a[i]==0)
        {
            a[i] = 2;
            flag = 1;
            buttn3.setBackgroundColor(Color.RED);

        }
        check();
    }protected void on4(View view)
    {
        Button buttn4 = (Button) findViewById(R.id.button4);
        i = 3;
        if(flag == 1 && a[i]==0)
        {
            a[i] = 1;
            flag =2;
            buttn4.setBackgroundColor(Color.BLUE);

        }
        else if(flag == 2&& a[i]==0)
        {
            a[i] = 2;
            flag = 1;
            buttn4.setBackgroundColor(Color.RED);

        }
        check();
    }protected void on5(View view)
    {
        Button buttn5 = (Button) findViewById(R.id.button5);
        i = 4;

        if(flag == 1 && a[i]==0)
        {
            a[i] = 1;
            flag =2;
            buttn5.setBackgroundColor(Color.BLUE);

        }
        else if(flag == 2&& a[i]==0)
        {
            a[i] = 2;
            flag = 1;
            buttn5.setBackgroundColor(Color.RED);

        }
        check();
    }protected void on6(View view)
    { Button buttn6 = (Button) findViewById(R.id.button6);
        i = 5;

        if(flag == 1 && a[i]==0)
        {
            a[i] = 1;
            flag =2;
            buttn6.setBackgroundColor(Color.BLUE);

        }
        else if(flag == 2&& a[i]==0)
        {
            a[i] = 2;
            flag = 1;
            buttn6.setBackgroundColor(Color.RED);

        }
        check();
    }protected void on7(View view)
    {
        Button buttn7 = (Button) findViewById(R.id.button7);
        i = 6;

        if(flag == 1 && a[i]==0)
        {
            a[i] = 1;
            flag =2;
            buttn7.setBackgroundColor(Color.BLUE);

        }
        else if(flag == 2&& a[i]==0)
        {
            a[i] = 2;
            flag = 1;
            buttn7.setBackgroundColor(Color.RED);

        }
        check();
    }protected void on8(View view)
    {
        Button buttn8 = (Button) findViewById(R.id.button8);
        i = 7;

        if(flag == 1 && a[i]==0)
        {
            a[i] = 1;
            flag =2;
            buttn8.setBackgroundColor(Color.BLUE);

        }
        else if(flag == 2&& a[i]==0)
        {
            a[i] = 2;
            flag = 1;
            buttn8.setBackgroundColor(Color.RED);

        }
        check();
    }protected void on9(View view)
    {
        Button buttn9 = (Button) findViewById(R.id.button9);
        i = 8;

        if(flag == 1 && a[i]==0)
        {
            a[i] = 1;
            flag =2;
            buttn9.setBackgroundColor(Color.BLUE);

        }
        else if(flag == 2&& a[i]==0)
        {
            a[i] = 2;
            flag = 1;
            buttn9.setBackgroundColor(Color.RED);

        }
        check();
    }
    public  void drawLine(int line, int player)
    {
        Button buttn1 = (Button) findViewById(R.id.button1);
        Button buttn9 = (Button) findViewById(R.id.button9);
        Button buttn4 = (Button) findViewById(R.id.button4);
        Button buttn2 = (Button) findViewById(R.id.button2);
        Button buttn3 = (Button) findViewById(R.id.button3);
        Button buttn5 = (Button) findViewById(R.id.button5);
        Button buttn6 = (Button) findViewById(R.id.button6);
        Button buttn7 = (Button) findViewById(R.id.button7);
        Button buttn8 = (Button) findViewById(R.id.button8);

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
protected void check()
{if(a[0]==a[1]&&a[1]==a[2]&&a[0]!=0)
{drawLine(1, a[0]);
}
if(a[3]==a[4]&&a[4]==a[5]&&a[3]!=0)
{drawLine(2, a[3]);
}
if(a[6]==a[7]&&a[7]==a[8]&&a[6]!=0)
{drawLine(3, a[6]);
}
    if(a[0]==a[3]&&a[3]==a[6]&&a[0]!=0)
    {drawLine(4, a[0]);
    }
    if(a[1]==a[4]&&a[4]==a[7]&&a[4]!=0)
    {drawLine(5, a[1]);
    }
    if(a[2]==a[5]&&a[5]==a[8]&&a[5]!=0)
    {drawLine(6, a[2]);
    }
    if(a[0]==a[4]&&a[4]==a[8]&&a[8]!=0)
    {drawLine(7, a[0]);
    }
    if(a[2]==a[4]&&a[4]==a[6]&&a[4]!=0)
    {drawLine(8, a[2]);
    }


}}
