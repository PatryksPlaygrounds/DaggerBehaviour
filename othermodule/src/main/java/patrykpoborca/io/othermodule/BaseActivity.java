package patrykpoborca.io.othermodule;

import android.app.Activity;

import javax.inject.Inject;

/**
 * Created by patrykpoborca on 7/10/16.
 */

public abstract class BaseActivity<T extends BaseClassTwo> extends Activity {

    private T baseClassTwo;

    @Inject
    public final void setBaseClassTwo(T baseClassTwo) {
        this.baseClassTwo = baseClassTwo;
    }
}
