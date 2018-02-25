package com.mytaxi.common.usecases.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import de.gfred.feature.one.MainActivity;
import de.gfred.feature.one.di.MainActivityComponent;


//@Module(includes = MainActivityBuilderModule.class)
//public abstract class ActivityUseCasesModule {
//}

@Module(subcomponents = MainActivityComponent.class)
public abstract class ActivityUseCasesModule {
    @ContributesAndroidInjector
    public abstract MainActivity contributeMainActivity();
}