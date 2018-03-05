package de.gfred.core.services.di;

import de.gfred.shared.services.StringService;
import dagger.Subcomponent;

@Subcomponent(modules = UserServiceModule.class)
public interface UserServiceComponent
{
    StringService userService();

    @Subcomponent.Builder
    interface Builder
    {
        Builder requestModule(UserServiceModule module);

        UserServiceComponent build();
    }
}
