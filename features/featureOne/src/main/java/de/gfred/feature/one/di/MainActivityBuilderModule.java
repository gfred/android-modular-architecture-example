package de.gfred.feature.one.di;

import de.gfred.core.services.di.UserServiceModule;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import de.gfred.feature.one.MainActivity;

@Module
public abstract class MainActivityBuilderModule
{
    @ContributesAndroidInjector(modules = {MainActivityModule.class, UserServiceModule.class})
    public abstract MainActivity contributeMainActivity();
}
