package com.notifical.example;

import android.app.Application;

import com.google.firebase.iid.FirebaseInstanceId;



public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseInstanceId.getInstance().getToken();
    }
}
