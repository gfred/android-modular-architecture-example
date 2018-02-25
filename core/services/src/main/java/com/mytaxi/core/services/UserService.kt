package com.mytaxi.core.services

import javax.inject.Singleton


@Singleton
class UserService() : IUserService {
    private var userName = "Batman"

    override fun hasUserName(): Boolean = userName.isNotEmpty()

    override fun getUserName() = userName

    override fun setUserName(userName: String) {
        this.userName = userName
    }
}