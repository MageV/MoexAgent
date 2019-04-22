package ru.magev.moexagent.Modules;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    Application application;

    public AppModule(Application application)
    {
        this.application=application;
    }

    @Provides
    @Singleton
    public Application providesApplication()
    {
        return this.application;
    }
}
