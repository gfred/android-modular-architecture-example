package com.mytaxi.common.usecases

import io.reactivex.disposables.CompositeDisposable


abstract class AbstractUseCase {
    protected val disposables = CompositeDisposable()

    fun clear() = disposables.clear()
}
