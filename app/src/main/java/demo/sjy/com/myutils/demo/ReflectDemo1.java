package demo.sjy.com.myutils.demo;


import com.sjy.utils.Logger;

/**
 * 练习方法反射的类
 */
public class ReflectDemo1 {
    public void logA(String a, String b) {
        Logger.d(a + "--拼接--" + b);
    }

    public void logA(int a, int b) {
        Logger.d("计算和=" + (a + b));
    }

}
