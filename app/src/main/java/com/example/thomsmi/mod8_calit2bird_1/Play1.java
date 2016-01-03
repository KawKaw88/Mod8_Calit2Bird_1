package com.example.thomsmi.mod8_calit2bird_1;
import java.util.ArrayList;
import java.util.List;
import android.util.Log;

/**
 * Created by thomsmi on 1/3/2016.
 */
public class Play1
{
    private ArrayList<String> data1 = new ArrayList<String>();

    public void DoSomething()
    {
        Log.v("Play1", "DoSomething() - Start");


        data1.clear();
        data1.add("Mom");
        data1.add("Apple");
        data1.add("Pie");

        Log.v("Play1", "debug 57a");

        int i = 0;
        for (String item : data1)
        {
            i++;
            String str1 = String.format("%d", i);
            Log.v("Play1", str1);
            Log.v("Play1", item);
        }

        Log.v("Play1","DoSomething() - End");
    }
}
