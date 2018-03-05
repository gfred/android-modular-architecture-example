package de.gfred.feature.one.di;

import de.gfred.shared.models.navigation.features.FeatureOneNavigator;
import de.gfred.shared.models.navigation.NavigationProvider;
import de.gfred.shared.models.services.StringService;
import de.gfred.shared.models.tracking.TrackingService;
import dagger.Module;
import dagger.Provides;
import de.gfred.feature.one.FeatureOnePresenter;
import de.gfred.feature.one.FeatureOnePresenterImpl;
import javax.inject.Singleton;

@Singleton
@Module
public class FeatureOneActivityModule
{
    @Provides
    public FeatureOneNavigator provideFeatureOneNavigator(final NavigationProvider navigationProvider)
    {
        return navigationProvider.provideFeatureOneNavigator();
    }


    @Provides
    public FeatureOnePresenter provideMainPresenter(final FeatureOneNavigator navigator, final TrackingService trackingService, final StringService userService)
    {
        return new FeatureOnePresenterImpl(navigator, trackingService, userService);
    }
}