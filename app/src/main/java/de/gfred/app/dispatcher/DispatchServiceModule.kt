package de.gfred.app.dispatcher

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DispatchServiceModule {
    @Provides
    @Singleton
    fun provideDispatchService(dispatchService: IDispatchService): IDispatchService {
        return dispatchService;
    }
}