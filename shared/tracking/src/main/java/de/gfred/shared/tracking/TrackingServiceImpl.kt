package de.gfred.shared.tracking

import android.content.Context
import android.util.Log
import de.gfred.shared.models.tracking.TrackingService
import javax.inject.Inject


class TrackingServiceImpl @Inject constructor(private val context: Context) : TrackingService {
    override fun track(value: String) {
        Log.d(TrackingServiceImpl::class.java.simpleName, context.getString(R.string.tracking_track_msg, value))
    }
}