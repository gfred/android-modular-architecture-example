package de.gfred.app.di;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import de.gfred.app.MainApplication;
import de.gfred.app.dispatcher.IDispatchService;
import java.util.Set;
import javax.inject.Singleton;

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBindingModule.class})
public interface AppComponent extends AndroidInjector<MainApplication>
{
    Set<IDispatchService> exposeDispatchServices();

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MainApplication>
    {
        @Override
        public abstract AppComponent build();
    }
}