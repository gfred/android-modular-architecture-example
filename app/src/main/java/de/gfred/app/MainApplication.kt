package de.gfred.app

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.HasActivityInjector
import de.gfred.feature.one.MainActivityViewActions
import de.gfred.feature.two.FeatureTwoActivity
import javax.inject.Inject


class MainApplication : HasActivityInjector, DaggerApplication() {

    @Inject
    lateinit var mainAc: MainActivityViewActions

    override fun onCreate() {
        super.onCreate()

        mainAc.onButtonOneClicked().subscribe { FeatureTwoActivity.start(this) }
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = DaggerAppComponent.builder().create(this)
}
