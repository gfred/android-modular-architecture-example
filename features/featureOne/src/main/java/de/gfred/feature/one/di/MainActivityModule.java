package de.gfred.feature.one.di;

import com.mytaxi.shared.models.navigation.IFeatureOneNavigator;
import com.mytaxi.shared.models.navigation.INavigationProvider;
import dagger.Module;
import dagger.Provides;
import de.gfred.feature.one.IMainPresenter;
import de.gfred.feature.one.MainPresenter;
import javax.inject.Singleton;

@Module
public class MainActivityModule
{
    @Provides
    @Singleton
    public IMainPresenter provideMainPresenter(final IFeatureOneNavigator navigator)
    {
        return new MainPresenter(navigator);
    }


    @Provides
    @Singleton
    public IFeatureOneNavigator provideFeatureOneNavigator(final INavigationProvider navigationProvider)
    {
        return navigationProvider.provideFeatureOneNavigator();
    }
}