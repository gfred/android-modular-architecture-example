package de.gfred.feature.one

import com.mytaxi.shared.models.navigation.IFeatureOneNavigator
import io.reactivex.disposables.CompositeDisposable


class MainPresenter(private val navigation: IFeatureOneNavigator) : IMainPresenter {
    private var disposables = CompositeDisposable()

    override fun create(activity: MainActivity) {
        disposables.add(activity.onButtonOneClicked().subscribe { activity.showToast() })
        disposables.add(activity.onButtonTwoClicked().subscribe { navigation.showFeatureTwo() })
    }

    override fun destroy() = disposables.clear()
}