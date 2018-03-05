package de.gfred.feature.two.di;

import de.gfred.shared.models.services.IUserService;
import dagger.Module;
import dagger.Provides;
import de.gfred.feature.two.FeatureTwoPresenter;
import de.gfred.feature.two.IFeatureTwoPresenter;

@Module
public class FeatureTwoActivityModule
{
    @Provides
    public IFeatureTwoPresenter providesFeatureTwoPresenter(final IUserService userService)
    {
        return new FeatureTwoPresenter(userService);
    }
}
