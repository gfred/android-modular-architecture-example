package de.gfred.feature.one

import de.gfred.shared.interactors.GetValueInteractor
import de.gfred.shared.interactors.UpdateValueInteractor
import de.gfred.shared.navigation.features.FeatureOneNavigator
import de.gfred.shared.tracking.TrackingService
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject


class FeatureOnePresenterImpl @Inject constructor(private val navigation: FeatureOneNavigator,
                                                  private val tracker: TrackingService,
                                                  private val getValueInteractor: GetValueInteractor,
                                                  private val updateValueInteractor: UpdateValueInteractor) : FeatureOnePresenter {

    private var disposables = CompositeDisposable()

    override fun create(activity: FeatureOneActivity) {
        disposables.add(getValueInteractor.receiveValue().subscribe({ activity.setValue(it) }))
        
        disposables.add(activity.onValueChanged().subscribe() {
            tracker.track("Value changed: $it")
            updateValueInteractor.doUpdateValue(it.toString())
        })

        disposables.add(activity.onButtonOneClicked()
                .doOnNext({ tracker.track("Button one clicked!") })
                .flatMap { getValueInteractor.receiveValue() }
                .subscribe { activity.showToast(it) })

        disposables.add(activity.onButtonTwoClicked().subscribe {
            tracker.track("Button two clicked!")
            navigation.showFeatureTwo()
        })
    }

    override fun destroy() = disposables.clear()
}