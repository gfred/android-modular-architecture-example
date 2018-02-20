package com.mytaxi.common.usecases.featureOne

import android.content.Context
import android.widget.Toast
import com.mytaxi.common.usecases.AbstractUseCase
import de.gfred.feature.one.MainActivityViewActions
import io.reactivex.disposables.Disposable

class OpenFeatureTwoOnButtonClick(private val context: Context, private val viewActions: MainActivityViewActions) : AbstractUseCase() {
    override fun getUseCaseDisposable(): Disposable = viewActions.onButtonOneClicked().subscribe { Toast.makeText(context, "TEST 123", Toast.LENGTH_SHORT).show() }

}