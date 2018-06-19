package demo.sjy.com.myutils;

import android.app.Application;

import demo.sjy.com.myutils.utils.MLog;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        MLog.init(true, "SJY");
    }
}
