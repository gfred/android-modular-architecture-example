package de.gfred.feature.one

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.subjects.PublishSubject


class MainPresenter : IMainPresenter, IMainActions {
    private var disposables = CompositeDisposable()
    private var onClickSubject = PublishSubject.create<Any>()

    override fun create(activity: MainActivity) {
        disposables.add(activity.onButtonOneClicked().subscribe { activity.showToast() })
        disposables.add(activity.onButtonTwoClicked().subscribe {onClickSubject})
    }

    override fun destroy() =  disposables.clear()

    override fun onButtonShowClick() = onClickSubject

    override fun getEnteredUserName() = "Robin"
}