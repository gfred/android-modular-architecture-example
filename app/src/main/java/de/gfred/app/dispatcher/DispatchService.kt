package de.gfred.app.dispatcher

import android.content.Context
import de.gfred.feature.one.MainActivityViewActions
import de.gfred.feature.two.FeatureTwoActivity
import io.reactivex.disposables.CompositeDisposable

class DispatchService(private val context: Context, private val mainActivity: MainActivityViewActions) : IDispatchService {

    private val subscriptions = CompositeDisposable()
    
    override fun onStart() {
        subscriptions.add(mainActivity.onButtonOneClicked().subscribe { FeatureTwoActivity.start(context) })
    }

    override fun onStop() {
        subscriptions.clear()
    }
}