package de.gfred.core.interactors.di

import dagger.Module
import dagger.Provides
import de.gfred.core.interactors.GetValueInteractorImpl
import de.gfred.core.services.di.StringServiceComponent
import de.gfred.core.services.di.StringServiceModule
import de.gfred.shared.interactors.GetValueInteractor

@Module(includes = [StringServiceModule::class])
class GetValueInteractorModule {

    @Provides
    fun provideGetValueInteractor(interactorImpl: GetValueInteractorImpl): GetValueInteractor = interactorImpl
}