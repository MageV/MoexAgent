package ru.magev.moexagent.Interfaces;

import dagger.Component;
import ru.magev.moexagent.Modules.mainActivityModule;
import ru.magev.moexagent.UI.MainActivity;

@Component(modules = mainActivityModule.class)
@ActivityContext
public interface mainActivityComponent {
    void inject(MainActivity mainActivity);
}
