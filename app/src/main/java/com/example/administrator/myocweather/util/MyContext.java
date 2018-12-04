package com.example.administrator.myocweather.util;

import android.app.Application;
import android.content.Context;
import org.litepal.LitePal;


public class MyContext extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        context = getApplicationContext();
        LitePal.initialize(context);
    }
    public static Context getContext(){
        return context;
    }
}
