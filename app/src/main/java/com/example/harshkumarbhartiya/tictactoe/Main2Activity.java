package com.example.harshkumarbhartiya.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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
        }
        else if(flag == 2&& a[i]==0)
        {
            a[i] = 2;
            flag = 1;
        }
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
    }
}
