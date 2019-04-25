package ru.magev.moexagent.Modules;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.magev.moexagent.Common.StartApplication;
import ru.magev.moexagent.Interfaces.ApplicationContext;

@Module
public class ApplicationModule {

    StartApplication application;

    public ApplicationModule(StartApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    @ApplicationContext
    public StartApplication providesApplication() {
        return application;
    }

    @Singleton
    @Provides
    @ApplicationContext
    public Context providesContext() {
        return application.getApplicationContext();
    }

}
