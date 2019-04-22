package ru.magev.moexagent.Interfaces;

import dagger.Component;
import ru.magev.moexagent.Modules.mainActivityModule;

@Component(dependencies = AppComponent.class, modules = mainActivityModule.class)
public interface mainActivityComponent {


}
