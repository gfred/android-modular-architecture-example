package de.gfred.app.di;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import de.gfred.app.dispatcher.IDispatchService;
import de.gfred.app.dispatcher.MainActivityDispatchService;
import de.gfred.app.dispatcher.TestDispatchService;
import de.gfred.feature.one.MainActivity;
import de.gfred.feature.one.MainActivityViewActions;
import javax.inject.Singleton;

@Module
public class AppModule
{
    @Provides
    public MainActivityViewActions provideMainActivity(MainActivity mainActivity)
    {
        return mainActivity;
    }


    @Provides
    @IntoSet
    @Singleton
    public IDispatchService providerMainActivityDispatchService(MainActivityViewActions mainActivity)
    {
        return new MainActivityDispatchService(mainActivity);
    }


    @Provides
    @IntoSet
    @Singleton
    public static IDispatchService provideTestDispatchServiceA()
    {
        return new TestDispatchService("A");
    }
}
