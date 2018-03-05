package de.gfred.feature.one.di;

import de.gfred.shared.models.navigation.features.FeatureOneNavigator;
import de.gfred.shared.models.navigation.NavigationProvider;
import de.gfred.shared.models.services.IUserService;
import de.gfred.shared.models.tracking.TrackingService;
import dagger.Module;
import dagger.Provides;
import de.gfred.feature.one.IMainPresenter;
import de.gfred.feature.one.MainPresenter;
import javax.inject.Singleton;

@Singleton
@Module
public class MainActivityModule
{
    @Provides
    public FeatureOneNavigator provideFeatureOneNavigator(final NavigationProvider navigationProvider)
    {
        return navigationProvider.provideFeatureOneNavigator();
    }


    @Provides
    public IMainPresenter provideMainPresenter(final FeatureOneNavigator navigator, final TrackingService trackingService, final IUserService userService)
    {
        return new MainPresenter(navigator, trackingService, userService);
    }
}