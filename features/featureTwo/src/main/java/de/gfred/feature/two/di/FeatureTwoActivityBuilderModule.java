package de.gfred.feature.two.di;

import com.mytaxi.core.services.di.UserServiceModule;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import de.gfred.feature.two.FeatureTwoActivity;

@Module
public abstract class FeatureTwoActivityBuilderModule
{
    @ContributesAndroidInjector(modules = {FeatureTwoActivityModule.class, UserServiceModule.class})
    public abstract FeatureTwoActivity contributeFeatureTwoActivity();
}
