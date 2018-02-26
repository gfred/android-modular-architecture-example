package com.mytaxi.shared.tracking.di;

import android.content.Context;

import com.mytaxi.shared.models.services.ITrackingService;
import com.mytaxi.shared.tracking.TrackingService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Singleton
@Module
public class TrackingServiceModule {

    @Provides
    public ITrackingService provideTrackingService(final Context context) {
        return new TrackingService(context);
    }
}
