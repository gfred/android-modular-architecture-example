package de.gfred.app.navigator

import android.content.Context
import android.content.Intent
import com.mytaxi.shared.models.navigation.IFeatureOneNavigator
import com.mytaxi.shared.models.navigation.INavigationProvider
import de.gfred.feature.two.FeatureTwoActivity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NavigationProvider @Inject constructor(private val context: Context) : INavigationProvider {
    override fun provideFeatureOneNavigator(): IFeatureOneNavigator = object : IFeatureOneNavigator {
        override fun showFeatureTwo() {
            context.startActivity(Intent(context, FeatureTwoActivity::class.java))
        }
    }
}