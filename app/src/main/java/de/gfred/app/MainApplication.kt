package de.gfred.app

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import de.gfred.app.di.DaggerAppComponent
import javax.inject.Inject



class MainApplication : DaggerApplication() {


    override fun onCreate() {
        super.onCreate()
    }


    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = DaggerAppComponent.builder().create(this)
}
