public class Dog {
    /**
     * 类的一些概念和修饰符的概念
     */
    public String name;/*实例变量（就是这个对象的变量 《全局变量》要在对象创建后才可以使用，并且至少要有一个方法，构造方法或者语句块包含他
                       才可以使用 ）*/
    public int age;

    public boolean bool;

    public static String clazz = "class";//类变量（静态变量），在加载类的时候就已经有了可以直接Dog.clazz得到值，但还可以改变

    public static final String SF = "staticFinal";//加了final可就不能变了

    private volatile boolean active;

    public void run() {
        active = true;
        while (active) // 第一行
        {
            // 代码
        }
    }

    public void stop() {
        active = false; // 第二行
    }

    /**
     * 通常情况下，在一个线程调用 run() 方法（在 Runnable 开启的线程），在另一个线程调用 stop() 方法。
     * 如果 第一行 中缓冲区的 active 值被使用，那么在 第二行 的 active 值为 false 时循环不会停止。
     * 但是以上代码中我们使用了 volatile 修饰 active，所以该循环会停止。
     */

    public void eat() {
        String str = "吃东西";//局部变量，在方法中，需要初始化，不使用访问修饰符
        System.out.println(str);
    }

    public Dog(String empname) {
        name = empname;//当创建有参构造器后，new对象时必须赋值empname
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public static String getClazz() {
        return clazz;
    }

    public static void setClazz(String clazz) {
        Dog.clazz = clazz;
    }

    public static String getSF() {
        return SF;
    }
}
