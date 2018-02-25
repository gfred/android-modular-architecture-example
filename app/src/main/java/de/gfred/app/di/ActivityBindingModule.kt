package de.gfred.app.di

import com.mytaxi.common.usecases.di.ActivityUseCasesModule
import dagger.Module

@Module(includes = [ActivityUseCasesModule::class])
abstract class ActivityBindingModule {
}