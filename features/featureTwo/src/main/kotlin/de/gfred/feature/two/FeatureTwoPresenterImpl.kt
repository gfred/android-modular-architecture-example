package de.gfred.feature.two

import de.gfred.feature.two.two.R
import de.gfred.shared.interactors.GetValueInteractor
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject


class FeatureTwoPresenterImpl @Inject constructor(private val getValueInteractor: GetValueInteractor) : FeatureTwoPresenter {

    private var disposables = CompositeDisposable()

    override fun create(activity: FeatureTwoActivity) {
        if (getValueInteractor.hasValue()) {
            disposables.add(getValueInteractor.receiveValue().subscribe({ activity.setValue(it) }))
        } else {
            activity.setValue(activity.getString(R.string.feature_two_string_value_not_available))
        }
    }

    override fun destroy() {
        disposables.clear()
    }
}