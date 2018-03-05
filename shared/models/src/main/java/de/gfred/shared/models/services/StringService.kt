package de.gfred.shared.models.services

interface StringService {
    fun hasString() : Boolean
    fun getString(): String
    fun setString(userName: String)
}