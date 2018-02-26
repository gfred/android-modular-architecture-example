package com.mytaxi.core.services

import com.mytaxi.shared.models.services.IUserService


class UserService() : IUserService {
    private var userName = "Batman"

    override fun hasUserName(): Boolean = userName.isNotEmpty()

    override fun getUserName() = userName

    override fun setUserName(userName: String) {
        this.userName = userName
    }
}