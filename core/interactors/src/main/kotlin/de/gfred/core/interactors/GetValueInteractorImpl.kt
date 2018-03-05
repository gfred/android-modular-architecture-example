package de.gfred.core.interactors

import de.gfred.shared.interactors.GetValueInteractor
import de.gfred.shared.services.StringService
import io.reactivex.Observable
import javax.inject.Inject


class GetValueInteractorImpl @Inject constructor(private val stringService: StringService) : GetValueInteractor {
    override fun hasValue() = stringService.hasString()

    override fun receiveValue() = Observable.just(stringService.getString())
}