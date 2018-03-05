package de.gfred.feature.one

import de.gfred.shared.models.navigation.features.FeatureOneNavigator
import de.gfred.shared.models.services.StringService
import de.gfred.shared.models.tracking.TrackingService
import io.reactivex.disposables.CompositeDisposable


class FeatureOnePresenterImpl(private val navigation: FeatureOneNavigator,
                              private val tracker: TrackingService,
                              private val userService: StringService) : FeatureOnePresenter {

    private var disposables = CompositeDisposable()

    override fun create(activity: FeatureOneActivity) {
        activity.setUserName(userService.getString())

        disposables.add(activity.onUserNameChanged().subscribe() {
            tracker.track("On Text Changed:" + it)
            userService.setString(it.toString())
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