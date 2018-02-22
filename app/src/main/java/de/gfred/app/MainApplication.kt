package de.gfred.app

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import de.gfred.app.di.DaggerAppComponent

class MainApplication : DaggerApplication() {
    override fun onCreate() {
        super.onCreate()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = DaggerAppComponent.builder().create(this)
}
