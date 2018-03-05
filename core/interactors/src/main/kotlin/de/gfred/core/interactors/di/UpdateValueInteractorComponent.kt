package de.gfred.core.interactors.di

import dagger.Subcomponent
import de.gfred.shared.interactors.UpdateValueInteractor

@Subcomponent(modules = [UpdateValueInteractorModule::class])
interface UpdateValueInteractorComponent {
    fun updateValueInteractor(): UpdateValueInteractor

    @Subcomponent.Builder
    interface Builder {
        fun requestModule(module: UpdateValueInteractorModule): Builder

        fun build(): UpdateValueInteractorComponent
    }
}
