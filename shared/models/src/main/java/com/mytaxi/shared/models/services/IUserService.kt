package com.mytaxi.shared.models.services

interface IUserService {
    fun hasUserName() : Boolean
    fun getUserName(): String
    fun setUserName(userName: String)
}