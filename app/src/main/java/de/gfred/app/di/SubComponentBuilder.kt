package de.gfred.app.di

/**
 * Created by f.goetz on 2/16/18.
 */
interface SubComponentBuilder<V> {
    fun build(): V
}