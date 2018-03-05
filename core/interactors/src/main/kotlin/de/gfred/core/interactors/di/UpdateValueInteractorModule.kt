package de.gfred.core.interactors.di

import dagger.Module
import dagger.Provides
import de.gfred.core.interactors.UpdateValueInteractorImpl
import de.gfred.core.services.di.StringServiceModule
import de.gfred.shared.interactors.UpdateValueInteractor

@Module(includes = [StringServiceModule::class])
class UpdateValueInteractorModule {

    @Provides
    fun provideUpdateValueInteractor(interactorImpl: UpdateValueInteractorImpl): UpdateValueInteractor = interactorImpl
}