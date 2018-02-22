package com.mytaxi.common.usecases.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import de.gfred.feature.one.MainActivity

@Module
abstract class ActivityUseCasesModule {
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}