package de.gfred.feature.two

import de.gfred.shared.models.services.StringService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FeatureTwoPresenterImpl @Inject constructor(private val userService: StringService) : FeatureTwoPresenter {

    override fun create(activity: FeatureTwoActivity) {
        if (userService.hasString()) {
            activity.setUserName(userService.getString())
        } else {
            activity.setUserName(activity.getString(R.string.feature_two_string_value_not_available))
        }
    }

    override fun destroy() {
    }
}