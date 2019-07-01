package demo.sjy.com.myutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sjy.utils.ClassUtils;
import com.sjy.utils.Logger;

import java.lang.reflect.Method;

import demo.sjy.com.myutils.demo.ReflectDemo1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //方法反射demo
        reflect0();
        reflect1();
        reflect2();
    }

    private void reflect0() {
        String s = ClassUtils.getAllDeclaredMethodsAndParams("Hello");
        Logger.d("获取String类的信息=" + s);
        String a = ClassUtils.getAllMethodsAndParams(1);
        Logger.d("获取int类的信息=" + a);
    }

    private void reflect1() {
        ReflectDemo1 demo1 = new ReflectDemo1();
        //获取类类型
        Class c = demo1.getClass();
        //
        try {
            //获取具体方法
//            Method m = c.getMethod("logA", new Class[]{int.class, int.class});//方式1 数组参数
            Method m = c.getMethod("logA", int.class, int.class);//方式2 参数...

            //方法的反射操作
            m.invoke(demo1, new Object[]{10, 20});//有参
//            m.invoke(demo1, new Object[]{});//无参
//            m.invoke(demo1);//无参
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void reflect2() {
        ReflectDemo1 demo1 = new ReflectDemo1();
        //获取类类型
        Class c = demo1.getClass();
        //
        try {
            //获取具体方法
//            Method m = c.getMethod("logA", new Class[]{int.class, int.class});//方式1 数组参数
            Method m = c.getMethod("logA", String.class, String.class);//方式2 参数...

            //方法的反射操作
            m.invoke(demo1, new Object[]{"SJY", "atBJ"});//有参
//            m.invoke(demo1, new Object[]{});//无参
//            m.invoke(demo1);//无参
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
