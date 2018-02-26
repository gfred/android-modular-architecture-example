package com.mytaxi.shared.tracking.di;

import com.mytaxi.shared.models.services.ITrackingService;

import dagger.Subcomponent;

@Subcomponent(modules={TrackingServiceModule.class})
public interface TrackingServiceComponent {
    ITrackingService trackingService();
}
