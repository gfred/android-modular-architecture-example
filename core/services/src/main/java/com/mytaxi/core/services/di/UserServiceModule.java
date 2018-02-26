package com.mytaxi.core.services.di;

import com.mytaxi.core.services.UserService;
import com.mytaxi.shared.models.services.IUserService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Singleton
@Module
public class UserServiceModule {
    @Provides
    public IUserService provideUserService() {
        return new UserService();
    }
}
