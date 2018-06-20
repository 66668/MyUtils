package demo.sjy.com.myutils.utils;


import java.lang.reflect.Method;

/**
 * 反射工具类
 * 用于获取类的信息
 * 知识点（1）
 * 说明：获取Class类的实例对象，有三种表述方式：
 * 1：String s1  = new String(); Class c1 = s1.class;
 * 2:Class c2 = String.getClass();
 * 3:Class c3 = Class.forName("某个类的全路径（包名+类）");
 * <p>
 * 知识点（2）动态加载类
 * 1静态加载类：编译时刻加载类
 * 2动态加载类：运行时刻加载类
 * eg:一些类可能不使用，但是其他类需要使用，如果使用静态加载类，在编译时刻不通过，非常不方便。
 * 所以，可以使用动态加载类，使用哪个类就加载哪个类，不影响功能，非常方便，
 * 动态加载的步骤1： Class c = Class.forName("全称类");
 * 步骤2：所有的子类interface抽象类B,然后强转:子类对象 A a = (B) c.newInstance();
 * 步骤3：使用子类的功能：a.xxx();
 * <p>
 * 知识点（3）方法放射基本用法：
 * 1：Method m = c.getMethod(方法名，参数的类类型);方法的名称和参数列表才能唯一决定某个方法
 * 2：Method.invoke(实例对象，参数列表); 就可以执行
 *
 * 知识点（4）方法的放射，是去范型化操作，非常有价值
 */
public class ClassUtils {

    //==============================类名==============================

    /**
     * 获取类全称
     *
     * @param obj
     * @return
     */
    public static String getName(Object obj) {
        Class c = obj.getClass();
        return c.getName();
    }

    /**
     * 获取类全称
     *
     * @param obj
     * @return
     */
    public static String getSimpleName(Object obj) {
        Class c = obj.getClass();
        return c.getSimpleName();
    }

    //==============================方法==============================

    /**
     * 获取类所有的方法(不包含参数)
     *
     * @param obj
     * @return
     */

    public static Method[] getAllMethod(Object obj) {
        Class c = obj.getClass();
        return c.getMethods();
    }

    /**
     * 获取类所有的方法(不包含参数)
     *
     * @param obj
     * @return
     */

    public static String getAllMethods(Object obj) {
        StringBuilder builder = new StringBuilder();
        Class c = obj.getClass();
        Method[] methods = c.getMethods();
        //遍历所有的方法名称
        for (Method m : methods) {
            builder.append(m.toString());
            builder.append("\n");
        }
        return builder.toString();
    }

    /**
     * 获取类所有的方法(包含参数)
     *
     * @param obj
     * @return
     */

    public static String getAllMethodsAndParams(Object obj) {
        StringBuilder builder = new StringBuilder();
        Class c = obj.getClass();
        Method[] methods = c.getMethods();
        //遍历所有的方法名称
        for (Method m : methods) {
            //返回值的类类型
            Class returnType = m.getReturnType();
            builder.append(returnType.getSimpleName()+" ");//返回值类型
            builder.append(m.getName());//方法名
            builder.append("(");
            //获取参数类的类类型
            Class[] paramsType = m.getParameterTypes();
            for(int i = 0;i<paramsType.length;i++){
                if (i==(paramsType.length-1)){
                    builder.append(paramsType[i].getSimpleName());
                }else {
                    builder.append(paramsType[i].getSimpleName() + ",");
                }
            }
            builder.append(")\n");
        }
        return builder.toString();
    }


    /**
     * 获取类自己声明的方法(不包含参数)
     *
     * @param obj
     * @return
     */

    public static Method[] getAllDeclaredMethod(Object obj) {
        Class c = obj.getClass();
        return c.getDeclaredMethods();
    }

    /**
     * 获取类自己声明的方法(不包含参数)
     *
     * @param obj
     * @return
     */
    public static String getAllDeclaredMethods(Object obj) {
        StringBuilder builder = new StringBuilder();
        Class c = obj.getClass();
        Method[] methods = c.getMethods();
        //遍历所有的方法名称
        for (Method m : methods) {
            builder.append(m.toString());
            builder.append("\n");
        }
        return builder.toString();
    }

    /**
     * 获取类所有的方法(包含参数)
     *
     * @param obj
     * @return
     */

    public static String getAllDeclaredMethodsAndParams(Object obj) {
        StringBuilder builder = new StringBuilder();
        Class c = obj.getClass();
        Method[] methods = c.getDeclaredMethods();
        //遍历所有的方法名称
        for (Method m : methods) {
            //返回值的类类型
            Class returnType = m.getReturnType();
            builder.append(returnType.getSimpleName()+" ");//返回值类型
            builder.append(m.getName());//方法名
            builder.append("(");
            //获取参数类的类类型
            Class[] paramsType = m.getParameterTypes();
            for(int i = 0;i<paramsType.length;i++){
                if (i==(paramsType.length-1)){
                    builder.append(paramsType[i].getSimpleName());
                }else {
                    builder.append(paramsType[i].getSimpleName() + ",");
                }
            }
            builder.append(")\n");
        }
        return builder.toString();
    }


}
