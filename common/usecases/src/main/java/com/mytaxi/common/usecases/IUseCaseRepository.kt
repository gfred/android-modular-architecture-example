package com.mytaxi.common.usecases

import de.gfred.feature.one.MainActivityViewActions

interface IUseCaseRepository {
    fun registerMainActivityUseCases(mainActivityViewActions: MainActivityViewActions)
    fun unregisterMainActivityUseCases()
}