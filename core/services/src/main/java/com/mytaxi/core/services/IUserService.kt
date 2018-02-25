package com.mytaxi.core.services

interface IUserService {
    fun hasUserName() : Boolean
    fun getUserName(): String
    fun setUserName(userName: String)
}