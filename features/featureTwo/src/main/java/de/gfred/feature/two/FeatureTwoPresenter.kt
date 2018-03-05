package de.gfred.feature.two

import android.util.Log
import de.gfred.shared.models.services.IUserService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FeatureTwoPresenter @Inject constructor(private val userService: IUserService) : IFeatureTwoPresenter {

    override fun create(activity: FeatureTwoActivity) {
        Log.d("TEST", ">> USER SERVICE REFERENCE 2: " + userService.toString())
        if (userService.hasUserName()) {
            activity.setUserName(userService.getUserName())
        } else {
            activity.setUserName(activity.getString(R.string.feature_two_user_name_not_available))
        }
    }

    override fun destroy() {
    }
}