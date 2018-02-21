package de.gfred.feature.one

import io.reactivex.Observable

interface MainActivityViewActions {
    fun onButtonOneClicked(): Observable<Any>

    fun onButtonTwoClicked(): Observable<Any>

    fun showToast()
}