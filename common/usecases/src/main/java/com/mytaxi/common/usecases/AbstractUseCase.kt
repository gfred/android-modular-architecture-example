package com.mytaxi.common.usecases

import io.reactivex.disposables.Disposable


abstract class AbstractUseCase {
    abstract fun getUseCaseDisposable(): Disposable
}
