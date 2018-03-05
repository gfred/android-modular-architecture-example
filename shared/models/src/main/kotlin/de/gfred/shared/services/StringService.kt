package de.gfred.shared.services

interface StringService {
    fun hasString(): Boolean
    fun getString(): String
    fun setString(value: String)
}