package de.gfred.feature.one.di;

import com.mytaxi.core.services.di.UserServiceComponent;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import de.gfred.feature.one.MainActivity;

@Module(subcomponents = {UserServiceComponent.class})
public abstract class MainActivityBuilderModule {
    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    public abstract MainActivity contributeMainActivity();
}
