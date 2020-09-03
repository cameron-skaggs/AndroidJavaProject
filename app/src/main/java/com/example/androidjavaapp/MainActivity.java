package com.example.androidjavaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        thisisabug
        AppCenter.start(getApplication(), "654bfb92-f7c8-4513-98bc-e1aa114cf442",
                Analytics.class, Crashes.class);
    }
    public void doNothing(View view) {
        Analytics.trackEvent("This is my nothing event");
    }
    /** Called when the user touches the button */
    public void crashApp(View view) {
        Analytics.trackEvent("My crash event");
        throw new RuntimeException("The application is crashed");
    }
}