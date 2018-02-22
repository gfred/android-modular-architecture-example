package com.mytaxi.common.usecases.di

import android.content.Context
import com.mytaxi.common.usecases.AbstractUseCase
import com.mytaxi.common.usecases.featureOne.OpenFeatureTwoOnButtonClick
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet
import de.gfred.feature.one.MainActivity
import javax.inject.Singleton


@Module
abstract class UseCasesModule {

    @Singleton
    @IntoSet
    @Provides
    fun provideUseCase(context: Context, activity: MainActivity): AbstractUseCase = OpenFeatureTwoOnButtonClick(context, activity)
}