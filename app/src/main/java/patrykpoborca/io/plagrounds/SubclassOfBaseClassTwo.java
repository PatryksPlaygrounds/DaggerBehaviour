package patrykpoborca.io.plagrounds;

import javax.inject.Inject;

import patrykpoborca.io.othermodule.BaseActivity;
import patrykpoborca.io.othermodule.BaseClassTwo;

/**
 * Created by patrykpoborca on 7/10/16.
 */
public class SubclassOfBaseClassTwo extends BaseClassTwo<MainActivity> {

    @Inject
    public SubclassOfBaseClassTwo(BaseActivity baseActivity) {
        super(baseActivity);
    }
}
