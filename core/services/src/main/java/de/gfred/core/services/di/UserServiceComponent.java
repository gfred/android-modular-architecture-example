package de.gfred.core.services.di;

import de.gfred.shared.models.services.IUserService;
import dagger.Subcomponent;

@Subcomponent(modules = UserServiceModule.class)
public interface UserServiceComponent
{
    IUserService userService();

    @Subcomponent.Builder
    interface Builder
    {
        Builder requestModule(UserServiceModule module);

        UserServiceComponent build();
    }
}
