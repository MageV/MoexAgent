package ru.magev.moexagent.Modules;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.magev.moexagent.Common.StartApplication;

@Module

public class ApplicationModule {

    StartApplication application;

    public ApplicationModule(StartApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public StartApplication providesApplication() {
        return application;
    }

    @Singleton
    @Provides
    public Context providesContext() {
        return application.getApplicationContext();
    }

}
