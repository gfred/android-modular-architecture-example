package com.mytaxi.common.usecases

import android.content.Context
import com.mytaxi.common.usecases.featureOne.OpenFeatureTwoOnButtonClick
import de.gfred.feature.one.MainActivityViewActions
import io.reactivex.disposables.CompositeDisposable


class UseCaseRepository(private val context: Context) : IUseCaseRepository {
    private val disposables = CompositeDisposable()

    override fun registerMainActivityUseCases(mainActivityViewActions: MainActivityViewActions) {
        disposables.add(OpenFeatureTwoOnButtonClick(context, mainActivityViewActions).getUseCaseDisposable())
    }

    override fun unregisterMainActivityUseCases() {
        // TODO : only remove feature one use cases.
        disposables.clear();
    }
}