package de.gfred.core.services.di;

import de.gfred.core.services.StringServiceImpl;
import de.gfred.shared.services.StringService;
import dagger.Module;
import dagger.Provides;

@Module
public class UserServiceModule
{
    @Provides
    public StringService provideUserService(final StringServiceImpl userService)
    {
        return userService;
    }
}
