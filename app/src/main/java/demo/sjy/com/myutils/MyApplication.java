package demo.sjy.com.myutils;

import android.app.Application;

import com.sjy.utils.Logger;


public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Logger.init(true, "SJY");
    }
}
