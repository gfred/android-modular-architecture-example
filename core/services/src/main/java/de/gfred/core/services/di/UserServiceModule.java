package de.gfred.core.services.di;

import de.gfred.core.services.UserService;
import de.gfred.shared.models.services.IUserService;
import dagger.Module;
import dagger.Provides;

@Module
public class UserServiceModule
{
    @Provides
    public IUserService provideUserService(final UserService userService)
    {
        return userService;
    }
}
