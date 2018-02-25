package de.gfred.feature.one.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import de.gfred.feature.one.IMainPresenter;
import de.gfred.feature.one.MainPresenter;

@Module
public class MainActivityModule
{
    @Provides
    @Singleton
    public IMainPresenter provideMainPresenter() {
        return new MainPresenter();
    }
}