package ru.magev.moexagent.Modules;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import ru.magev.moexagent.Interfaces.ActivityContext;
import ru.magev.moexagent.UI.MainActivity;

@Module
public class mainActivityModule {

    private MainActivity activity;

    public mainActivityModule(MainActivity activity)
    {
        this.activity=activity;
    }

    @Provides
    @ActivityContext
    public Context provideContext()
    {
        return this.activity.getApplicationContext();
    }
}
