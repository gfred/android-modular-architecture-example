package com.mytaxi.core.services

interface IUserService {
    fun getUserName(): String
    fun setUserName(userName: String)
}