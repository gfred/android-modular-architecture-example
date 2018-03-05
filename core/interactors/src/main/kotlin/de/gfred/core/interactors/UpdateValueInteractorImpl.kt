package de.gfred.core.interactors

import de.gfred.shared.interactors.UpdateValueInteractor
import de.gfred.shared.services.StringService
import javax.inject.Inject

class UpdateValueInteractorImpl @Inject constructor(private var stringService: StringService) : UpdateValueInteractor {
    override fun doUpdateValue(value: String) = stringService.setString(value)
}