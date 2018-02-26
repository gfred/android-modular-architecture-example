package de.gfred.feature.one.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import de.gfred.feature.one.MainActivity;

@Module
public abstract class MainActivityBuilderModule {
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    public abstract MainActivity contributeMainActivity();
}
