package de.gfred.core.services.di;

import de.gfred.shared.models.services.StringService;
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
