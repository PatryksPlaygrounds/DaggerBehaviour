package patrykpoborca.io.othermodule;

/**
 * Created by patrykpoborca on 7/10/16.
 */
public class BaseClassTwo<T extends BaseActivity> {

    private final T someActivity;

    public BaseClassTwo(BaseActivity baseActivity) {
        someActivity = (T) baseActivity;
    }
}
