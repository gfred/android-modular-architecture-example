package de.gfred.feature.one

import io.reactivex.Observable

interface IMainActions {
    fun onButtonShowClick() : Observable<Any>
    fun getEnteredUserName() : String
}
