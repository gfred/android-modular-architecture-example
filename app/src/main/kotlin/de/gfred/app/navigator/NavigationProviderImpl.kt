package de.gfred.navigator

import android.content.Context
import android.content.Intent
import de.gfred.shared.models.navigation.NavigationProvider
import de.gfred.shared.models.navigation.features.FeatureOneNavigator
import de.gfred.feature.two.FeatureTwoActivity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NavigationProviderImpl @Inject constructor(private val context: Context) : NavigationProvider {
    override fun provideFeatureOneNavigator(): FeatureOneNavigator = object : FeatureOneNavigator {
        override fun showFeatureTwo() {
            context.startActivity(Intent(context, FeatureTwoActivity::class.java))
        }
    }
}