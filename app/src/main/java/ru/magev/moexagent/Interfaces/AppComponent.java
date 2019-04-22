package ru.magev.moexagent.Interfaces;

import android.app.Application;

import dagger.Component;
import ru.magev.moexagent.Modules.AppModule;

@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(Application application);
}
