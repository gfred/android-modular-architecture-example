package de.gfred.feature.one.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import de.gfred.feature.one.MainActivity;

@Module(subcomponents = MainActivityComponent.class)
public abstract class MainActivityBuilderModule {
    @ContributesAndroidInjector
    public abstract MainActivity contributeMainActivity();
}
