package de.gfred.app.di;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import de.gfred.app.MainApplication;
import de.gfred.feature.one.di.FeatureOneBuilderModule;
import de.gfred.feature.two.di.FeatureTwoActivityBuilderModule;
import javax.inject.Singleton;

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, FeatureOneBuilderModule.class, FeatureTwoActivityBuilderModule.class})
public interface AppComponent extends AndroidInjector<MainApplication>
{

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MainApplication>
    {
    }
}
