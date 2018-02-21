package de.gfred.feature.one

import io.reactivex.disposables.CompositeDisposable


class MainPresenter {
    private var disposables = CompositeDisposable()
    // private var useCaseRepository = UseCase

    fun create(mainActivity: MainActivityViewActions) {
        disposables.add(mainActivity.onButtonOneClicked().subscribe { mainActivity.showToast() })
        disposables.add(mainActivity.onButtonTwoClicked().subscribe {})
    }

    fun destroy() {
        disposables.clear()
    }
}