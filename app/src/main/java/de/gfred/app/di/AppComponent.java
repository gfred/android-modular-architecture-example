package de.gfred.app.di;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import de.gfred.app.MainApplication;
import de.gfred.feature.one.di.MainActivityBuilderModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, MainActivityBuilderModule.class})
public interface AppComponent extends AndroidInjector<MainApplication>
{

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MainApplication>
    {
    }
}
