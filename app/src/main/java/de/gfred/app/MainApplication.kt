package de.gfred.app

import android.app.Activity
import android.app.Application
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject



class MainApplication : HasActivityInjector, Application() {
    @Inject
    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

//    val component: AppComponent by lazy {
//        DaggerAppComponent
//                .builder()
//                .appModule(AppModule(this))
//                .build()
//    }

    override fun onCreate() {
        super.onCreate()
    }

    override fun activityInjector(): DispatchingAndroidInjector<Activity> {
        return activityDispatchingAndroidInjector
    }
}
