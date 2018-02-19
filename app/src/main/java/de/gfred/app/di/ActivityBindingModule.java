package de.gfred.app.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import de.gfred.feature.one.MainActivity;

@Module
public abstract class ActivityBindingModule
{
    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();
}
