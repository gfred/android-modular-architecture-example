package de.gfred.core.services.di

import de.gfred.shared.services.StringService
import dagger.Subcomponent

@Subcomponent(modules = [StringServiceModule::class])
interface StringServiceComponent {
    fun userService(): StringService

    @Subcomponent.Builder
    interface Builder {
        fun requestModule(module: StringServiceModule): Builder

        fun build(): StringServiceComponent
    }
}
