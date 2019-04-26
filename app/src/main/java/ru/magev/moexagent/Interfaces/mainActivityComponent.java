package ru.magev.moexagent.Interfaces;

import dagger.Component;
import ru.magev.moexagent.Modules.mainActivityModule;

@Component(modules = mainActivityModule.class)
@ActivityContext
public interface mainActivityComponent {
}
