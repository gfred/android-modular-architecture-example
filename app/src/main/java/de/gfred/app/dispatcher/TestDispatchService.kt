package de.gfred.app.dispatcher

import android.util.Log

class TestDispatchService(private val a: String) : AbstractDispatchService() {

    override fun registerInteractions() {
        Log.d("TEST", ">> registerInteractions: TestDispatchService: " + a)
    }
}