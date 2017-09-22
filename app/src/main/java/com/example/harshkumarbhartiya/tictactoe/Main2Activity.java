package com.example.harshkumarbhartiya.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
        int flag=1,i;
    int a[] = new int[9];
    protected void on1()
    {
        i = 0;
        if(flag == 1 && a[i]==0)
        {
            a[i] = 1;
            flag =2;

            ((EditText)findViewById(R.id.fullscreen_content)).setText("");
        }
        else if(flag == 2&& a[i]==0)
        {
            a[i] = 2;
            flag = 1;

            ((TextView)findViewById(R.id.fullscreen_content)).setText("");
        }
        check();
    }protected void on2()
    {

        i = 1;
        if(flag == 1 && a[i]==0)
        {
            a[i] = 1;
            flag =2;
        }
        else if(flag == 2&& a[i]==0)
        {
            a[i] = 2;
            flag = 1;
        }

        check();
    }protected void on3()
    {

        i = 2;
        if(flag == 1 && a[i]==0)
        {
            a[i] = 1;
            flag =2;
        }
        else if(flag == 2&& a[i]==0)
        {
            a[i] = 2;
            flag = 1;
        }

        check();
    }protected void on4()
    {

        i = 3;
        if(flag == 1 && a[i]==0)
        {
            a[i] = 1;
            flag =2;
        }
        else if(flag == 2&& a[i]==0)
        {
            a[i] = 2;
            flag = 1;
        }

        check();
    }protected void on5()
    {

        i = 4;
        if(flag == 1 && a[i]==0)
        {
            a[i] = 1;
            flag =2;
        }
        else if(flag == 2&& a[i]==0)
        {
            a[i] = 2;
            flag = 1;
        }

        check();
    }protected void on6()
    {

        i = 5;
        if(flag == 1 && a[i]==0)
        {
            a[i] = 1;
            flag =2;
        }
        else if(flag == 2&& a[i]==0)
        {
            a[i] = 2;
            flag = 1;
        }

        check();
    }protected void on7()
    {

        i = 6;
        if(flag == 1 && a[i]==0)
        {
            a[i] = 1;
            flag =2;
        }
        else if(flag == 2&& a[i]==0)
        {
            a[i] = 2;
            flag = 1;
        }

        check();
    }protected void on8()
    {

        i = 7;
        if(flag == 1 && a[i]==0)
        {
            a[i] = 1;
            flag =2;
        }
        else if(flag == 2&& a[i]==0)
        {
            a[i] = 2;
            flag = 1;
        }

        check();
    }protected void on9()
    {

        i = 8;
        if(flag == 1 && a[i]==0)
        {
            a[i] = 1;
            flag =2;
        }
        else if(flag == 2&& a[i]==0)
        {
            a[i] = 2;
            flag = 1;
        }

        check();
    }
    public  void drawLine(int line, int player)
    {
        switch(line)
        {
            case 1:break;
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            case 8:break;
        }
    }
protected void check()
{if(a[0]==a[1]&&a[1]==a[2])
{drawLine(1, a[0]);
}
if(a[3]==a[4]&&a[4]==a[5])
{drawLine(2, a[3]);
}
if(a[6]==a[7]&&a[7]==a[8])
{drawLine(3, a[6]);
}
    if(a[0]==a[3]&&a[3]==a[6])
    {drawLine(4, a[0]);
    }
    if(a[1]==a[4]&&a[4]==a[7])
    {drawLine(5, a[1]);
    }
    if(a[2]==a[5]&&a[5]==a[8])
    {drawLine(6, a[2]);
    }
    if(a[0]==a[4]&&a[4]==a[8])
    {drawLine(7, a[0]);
    }
    if(a[2]==a[4]&&a[4]==a[6])
    {drawLine(8, a[2]);
    }


}}
