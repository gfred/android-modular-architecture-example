package de.gfred.feature.one.di;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import de.gfred.feature.one.MainActivity;

@Subcomponent(modules = MainActivityModule.class)
public interface MainActivityComponent extends AndroidInjector<MainActivity>
{
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>
    {
    }
}