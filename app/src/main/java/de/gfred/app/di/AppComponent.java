package de.gfred.app.di;

import com.mytaxi.shared.tracking.di.TrackingServiceModule;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import de.gfred.app.MainApplication;
import de.gfred.feature.one.di.MainActivityBuilderModule;
import de.gfred.feature.two.di.FeatureTwoActivityBuilderModule;
import javax.inject.Singleton;

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, MainActivityBuilderModule.class, FeatureTwoActivityBuilderModule.class})
public interface AppComponent extends AndroidInjector<MainApplication>
{

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MainApplication>
    {
    }
}
