package de.gfred.feature.two.di;

import de.gfred.shared.models.services.StringService;
import dagger.Module;
import dagger.Provides;
import de.gfred.feature.two.FeatureTwoPresenterImpl;
import de.gfred.feature.two.FeatureTwoPresenter;

@Module
public class FeatureTwoActivityModule
{
    @Provides
    public FeatureTwoPresenter providesFeatureTwoPresenter(final StringService userService)
    {
        return new FeatureTwoPresenterImpl(userService);
    }
}
