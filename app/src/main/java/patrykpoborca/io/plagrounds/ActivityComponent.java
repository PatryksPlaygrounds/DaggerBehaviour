package patrykpoborca.io.plagrounds;

import dagger.Component;
import patrykpoborca.io.othermodule.activitylevel.ActivityModule;
import patrykpoborca.io.othermodule.activitylevel.ActivityScope;
import patrykpoborca.io.othermodule.activitylevel.BaseActivityComponent;
import patrykpoborca.io.othermodule.applevel.AppComponent;

/**
 * Created by patrykpoborca on 7/10/16.
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent extends BaseActivityComponent {
    void inject(MainActivity activity);
}
