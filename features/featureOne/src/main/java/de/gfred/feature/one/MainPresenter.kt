package de.gfred.feature.one

import android.util.Log
import de.gfred.shared.models.navigation.features.FeatureOneNavigator
import de.gfred.shared.models.tracking.TrackingService
import de.gfred.shared.models.services.IUserService
import io.reactivex.disposables.CompositeDisposable


class MainPresenter(private val navigation: FeatureOneNavigator,
                    private val tracker: TrackingService,
                    private val userService: IUserService) : IMainPresenter {

    private var disposables = CompositeDisposable()

    override fun create(activity: MainActivity) {
        Log.d("TEST", ">> USER SERVICE REFERENCE 1: " + userService.toString())

        activity.setUserName(userService.getUserName())

        disposables.add(activity.onUserNameChanged().subscribe() {
            tracker.track("On Text Changed:" + it)
            userService.setUserName(it.toString())
        })

        disposables.add(activity.onButtonOneClicked().subscribe {
            tracker.track("Button One Clicked!")
            activity.showToast()
        })

        disposables.add(activity.onButtonTwoClicked().subscribe {
            tracker.track("Button Two Clicked!")
            navigation.showFeatureTwo()
        })
    }

    override fun destroy() = disposables.clear()
}