package ru.magev.moexagent.Modules;

import dagger.Module;
import dagger.Provides;
import ru.magev.moexagent.UI.MainActivity;

@Module
public class mainActivityModule {
    MainActivity mainActivity;

    public mainActivityModule(MainActivity activity) {
        this.mainActivity = activity;
    }

    @Provides
    public MainActivity providesActivity() {
        return mainActivity;
    }
}
