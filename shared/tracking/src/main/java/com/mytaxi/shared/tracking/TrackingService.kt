package com.mytaxi.shared.tracking

import android.content.Context
import android.util.Log
import com.mytaxi.shared.models.services.ITrackingService

class TrackingService(private val context: Context) : ITrackingService {
    override fun track(value: String) {
        Log.d("TrackingService", "track: $value")
    }
}