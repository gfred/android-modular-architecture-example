package de.gfred.app.dispatcher

import dagger.Subcomponent
import de.gfred.app.di.SubComponentBuilder

@Subcomponent(modules = [DispatchServiceModule::class])
interface DispatchServiceComponent {
    @Subcomponent.Builder
    interface Builder : SubComponentBuilder<DispatchServiceComponent> {
        fun dispatchServiceModule(netModule: DispatchServiceModule): Builder
    }
}