package com.mytaxi.shared.tracking

import android.content.Context
import android.util.Log
import com.mytaxi.shared.models.services.ITrackingService
import javax.inject.Inject


class TrackingService @Inject constructor(private val context: Context) : ITrackingService {
    override fun track(value: String) {
        Log.d(TrackingService::class.java.simpleName, context.getString(R.string.tracking_track_msg, value))
    }
}