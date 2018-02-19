package de.gfred.app;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import de.gfred.app.di.DaggerAppComponent;
import de.gfred.app.dispatcher.IDispatchService;
import java.util.Set;
import javax.inject.Inject;

public class MainApplication extends DaggerApplication
{

    @Inject
    protected Set<IDispatchService> dispatchServiceSet;


    @Override
    public void onCreate()
    {
        super.onCreate();

        for (IDispatchService dispatchService : dispatchServiceSet)
        {
            dispatchService.onStart();
        }
    }


    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector()
    {
        return DaggerAppComponent.builder().create(this);
    }
}
