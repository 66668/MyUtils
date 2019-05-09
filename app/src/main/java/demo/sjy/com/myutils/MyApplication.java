package demo.sjy.com.myutils;

import android.app.Application;

import demo.sjy.com.myutils.utils.Loger;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Loger.init(true, "SJY");
    }
}
