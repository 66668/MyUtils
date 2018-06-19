package demo.sjy.com.myutils.utils;


/**
 * 反射工具类
 * 用于获取类的信息
 * 知识点（1）
 * 说明：获取Class类的实例对象，有三种表述方式：
 * 1：String s1  = new String(); Class c1 = s1.class;
 * 2:Class c2 = String.getClass();
 * 3:Class c3 = Class.forName("某个类的全路径（包名+类）");
 * 知识点（2）动态加载类
 * 1静态加载类：编译时刻加载类
 * 2动态加载类：运行时刻加载类
 * eg:一些类可能不使用，但是其他类需要使用，如果使用静态加载类，在编译时刻不通过，非常不方便。
 * 所以，可以使用动态加载类，使用哪个类就加载哪个类，不影响功能，非常方便，
 * 动态加载的步骤1： Class c = Class.forName("全称类");
 * 步骤2：所有的子类interface抽象类B,然后强转:子类对象 A a = (B) c.newInstance();
 * 步骤3：使用子类的功能：a.xxx();
 * 知识点（3）方法的放射，是去范型化操作，非常有价值
 */
public class ClassUtils {


}
