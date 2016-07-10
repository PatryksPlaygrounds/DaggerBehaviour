package patrykpoborca.io.othermodule.applevel;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Provides;

/**
 * Created by patrykpoborca on 7/10/16.
 */

@Module
public class AppModule {

    private final Context context;

    public AppModule(Context context){
        this.context = context;
    }

    @Singleton
    @Provides
    public Context provideContext() {
        return context;
    }
}
