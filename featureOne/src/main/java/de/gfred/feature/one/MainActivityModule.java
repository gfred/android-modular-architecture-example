package de.gfred.feature.one;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {
    @Provides
    MainActivityViewActions provideMainView(MainActivity mainActivity) {
        return mainActivity;
    }
}