package patrykpoborca.io.othermodule.activitylevel;

import dagger.Module;
import dagger.Provides;
import patrykpoborca.io.othermodule.BaseActivity;

/**
 * Created by patrykpoborca on 7/10/16.
 */
@Module
public class ActivityModule {

    private final BaseActivity baseActivity;

    public ActivityModule(BaseActivity baseActivity) {
        this.baseActivity = baseActivity;
    }

    @ActivityScope
    @Provides
    public BaseActivity providesBaseActivity() {
        return baseActivity;
    }
}
