package test.dc.testjcenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dc.test.pub.Test;

/**
 * Created by senrsl on 2018/06/21 18:24:13
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Test().w();
        //./gradlew clean build bintrayUpload -PbintrayUser=dcjz -PbintrayKey=XXX -PdryRun=false
    }
}
