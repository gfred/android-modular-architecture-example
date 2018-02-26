package de.gfred.app.di

import dagger.Module
import de.gfred.feature.one.di.MainActivityBuilderModule

@Module(includes = [MainActivityBuilderModule::class])
abstract class ActivityBuilder {
}