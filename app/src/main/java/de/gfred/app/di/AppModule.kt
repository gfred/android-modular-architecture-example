package de.gfred.app.di

import android.app.Application
import com.mytaxi.shared.models.navigation.INavigationProvider
import dagger.Module
import dagger.Provides
import de.gfred.app.navigator.NavigationProvider
import javax.inject.Singleton


@Module
class AppModule {
    @Provides
    @Singleton
    fun providesApplication(application: Application): Application {
        return application
    }

    @Provides
    @Singleton
    fun provideNavigationProvider(application: Application): INavigationProvider {
        return NavigationProvider(application)
    }
}