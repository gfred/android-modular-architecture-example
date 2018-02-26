package com.mytaxi.core.services.di;


import com.mytaxi.shared.models.services.IUserService;

import javax.inject.Singleton;

import dagger.Subcomponent;

@Singleton
@Subcomponent(modules = UserServiceModule.class)
public interface UserServiceComponent {
    IUserService userService();

    @Subcomponent.Builder
    interface Builder {
        Builder requestModule(UserServiceModule module);
        UserServiceComponent build();
    }
}
