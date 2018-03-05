package de.gfred.core.services.di

import dagger.Subcomponent
import de.gfred.shared.services.StringService

@Subcomponent(modules = [StringServiceModule::class])
interface StringServiceComponent {
    fun stringService(): StringService

    @Subcomponent.Builder
    interface Builder {
        fun requestModule(module: StringServiceModule): Builder

        fun build(): StringServiceComponent
    }
}
