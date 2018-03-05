package de.gfred.shared.tracking.di;

import de.gfred.shared.models.tracking.TrackingService;
import de.gfred.shared.tracking.TrackingServiceImpl;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Singleton
@Module
public class TrackingServiceModule
{
    @Provides
    public TrackingService provideTrackingService(final TrackingServiceImpl trackingServiceImpl)
    {
        return trackingServiceImpl;
    }
}
