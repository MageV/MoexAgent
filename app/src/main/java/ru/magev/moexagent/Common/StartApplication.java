package ru.magev.moexagent.Common;

import android.app.Application;

import ru.magev.moexagent.Interfaces.AppComponent;
import ru.magev.moexagent.Interfaces.DaggerAppComponent;

public class StartApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate()
    {
        super.onCreate();
        appComponent=DaggerAppComponent.builder().build();
        appComponent.inject(this);
    }
}
