package de.gfred.app.di

import android.content.Context
import com.mytaxi.shared.models.navigation.INavigationProvider
import dagger.Module
import dagger.Provides
import de.gfred.app.MainApplication
import de.gfred.app.navigator.NavigationProvider
import javax.inject.Singleton

@Singleton
@Module
class AppModule {
    @Provides
    fun providesApplicationContext(application: MainApplication) : Context {
        return application
    }

    @Provides
    fun provideNavigationProvider(context: Context): INavigationProvider {
        return NavigationProvider(context)
    }
}