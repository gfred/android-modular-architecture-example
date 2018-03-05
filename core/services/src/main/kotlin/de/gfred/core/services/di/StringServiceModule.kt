package de.gfred.core.services.di

import dagger.Module
import dagger.Provides
import de.gfred.core.services.StringServiceImpl
import de.gfred.shared.services.StringService

@Module
class StringServiceModule {
    @Provides
    fun provideStringService(stringServiceImpl: StringServiceImpl): StringService = stringServiceImpl
}
