package patrykpoborca.io.othermodule.applevel;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by patrykpoborca on 7/10/16.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    Context context();
}
