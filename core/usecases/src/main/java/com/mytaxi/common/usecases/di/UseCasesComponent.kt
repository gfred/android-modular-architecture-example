package com.mytaxi.common.usecases.di

import com.mytaxi.common.usecases.featureOne.OpenFeatureTwoOnButtonClick
import dagger.Subcomponent
import javax.inject.Singleton


@Singleton
@Subcomponent(modules = [ActivityUseCasesModule::class, UseCasesModule::class])
interface UseCasesComponent {

    fun provideOpenFeatureTwoOnButtonClick(): OpenFeatureTwoOnButtonClick;

    @Subcomponent.Builder
    interface Builder {
        fun requestActivityUseCasesModule(module: ActivityUseCasesModule): Builder
        fun requestUseCasesModule(module: UseCasesModule): Builder
        fun build(): UseCasesComponent
    }
}