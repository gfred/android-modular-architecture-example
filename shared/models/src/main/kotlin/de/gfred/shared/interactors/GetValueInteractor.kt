package de.gfred.shared.interactors

import io.reactivex.Observable

interface GetValueInteractor {
    fun receiveValue(): Observable<String>

    fun hasValue(): Boolean
}