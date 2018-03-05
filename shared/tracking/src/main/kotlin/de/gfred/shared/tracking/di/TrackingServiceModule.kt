package de.gfred.shared.tracking.di

import dagger.Module
import dagger.Provides
import de.gfred.shared.tracking.TrackingService
import de.gfred.shared.tracking.TrackingServiceImpl
import javax.inject.Singleton

@Singleton
@Module
class TrackingServiceModule {
    @Provides
    fun provideTrackingService(trackingServiceImpl: TrackingServiceImpl): TrackingService = trackingServiceImpl
}
