package com.mytaxi.shared.tracking.di;

import com.mytaxi.shared.models.services.ITrackingService;
import com.mytaxi.shared.tracking.TrackingService;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Singleton
@Module
public class TrackingServiceModule
{
    @Provides
    public ITrackingService provideTrackingService(final TrackingService trackingService)
    {
        return trackingService;
    }
}
