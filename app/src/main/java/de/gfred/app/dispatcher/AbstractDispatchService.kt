package de.gfred.app.dispatcher

import io.reactivex.disposables.CompositeDisposable

abstract class AbstractDispatchService() : IDispatchService {

    private val subscriptions = CompositeDisposable()

    override fun onStart() {
        registerInteractions()
    }

    override fun onStop() {
        subscriptions.clear()
    }

    abstract fun registerInteractions()
}