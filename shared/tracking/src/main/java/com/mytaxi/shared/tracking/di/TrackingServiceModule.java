package com.mytaxi.shared.tracking.di;

import com.mytaxi.shared.models.tracking.TrackingService;
import com.mytaxi.shared.tracking.TrackingServiceImpl;
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
