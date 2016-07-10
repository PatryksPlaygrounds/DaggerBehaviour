package patrykpoborca.io.plagrounds;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import patrykpoborca.io.othermodule.BaseActivity;

public class MainActivity extends BaseActivity<SubclassOfBaseClassTwo> {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
