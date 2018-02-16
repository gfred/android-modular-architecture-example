package de.gfred.app.di;

import android.app.Application;
import android.content.Context;
import dagger.Module;
import dagger.Provides;
import de.gfred.feature.one.MainActivityViewActions;
import javax.inject.Singleton;

@Module
public class AppModule
{

    @Provides
    @Singleton
    Context provideContext(Application application)
    {
        return application;
    }


    @Provides
    @Singleton
    MainActivityViewActions provideDispatchService(MainActivityViewActions dispatchService)
    {
        return dispatchService;
    }

}
