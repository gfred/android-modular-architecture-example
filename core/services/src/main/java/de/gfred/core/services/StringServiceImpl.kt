package de.gfred.core.services

import de.gfred.shared.models.services.StringService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class StringServiceImpl @Inject constructor() : StringService {
    private var value = ""

    override fun hasString(): Boolean = value.isNotEmpty()

    override fun getString() = value

    override fun setString(value: String) {
        this.value = value
    }
}