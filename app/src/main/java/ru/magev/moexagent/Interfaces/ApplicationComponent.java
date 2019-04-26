package ru.magev.moexagent.Interfaces;

import dagger.Component;
import ru.magev.moexagent.Common.StartApplication;
import ru.magev.moexagent.Modules.ApplicationModule;

@ApplicationContext
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(StartApplication application);
}
