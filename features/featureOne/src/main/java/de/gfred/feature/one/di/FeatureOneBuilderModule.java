package de.gfred.feature.one.di;

import de.gfred.core.services.di.UserServiceModule;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import de.gfred.feature.one.FeatureOneActivity;

@Module
public abstract class FeatureOneBuilderModule
{
    @ContributesAndroidInjector(modules = {FeatureOneActivityModule.class, UserServiceModule.class})
    public abstract FeatureOneActivity contributeMainActivity();
}
