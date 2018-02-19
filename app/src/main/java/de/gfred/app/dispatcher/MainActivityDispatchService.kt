package de.gfred.app.dispatcher

import android.util.Log
import de.gfred.feature.one.MainActivityViewActions

class MainActivityDispatchService(activity: MainActivityViewActions) : AbstractDispatchService() {

    override fun registerInteractions() {
        Log.d("TEST", ">> REGISTER CLICKS: MainActivityDispatchService")
    }
}