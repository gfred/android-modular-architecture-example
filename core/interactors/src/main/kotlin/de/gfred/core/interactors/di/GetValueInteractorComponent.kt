package de.gfred.core.interactors.di

import dagger.Subcomponent
import de.gfred.shared.interactors.GetValueInteractor

@Subcomponent(modules = [GetValueInteractorModule::class])
interface GetValueInteractorComponent {
    fun getValueInteractor(): GetValueInteractor

    @Subcomponent.Builder
    interface Builder {
        fun requestModule(module: GetValueInteractorModule): Builder

        fun build(): GetValueInteractorComponent
    }
}
