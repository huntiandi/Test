package oop;

public class Son extends Father {
    public Son(int n) {
        System.out.println("son类star");
//        super(100);//子类会默认调用父类的无参构造器，若父类有有参构造器，则应该是使用super在子类
        //构造器中调用
    }

    @Override//重写，参数名字均不可变，即外壳不动，核心重写
    public void run() {//父类没声明你不可以抛，父类声明了可以不抛
        super.run();
        System.out.println("我跑的更快......");
    }

    public void run(String name, int n) {
        System.out.println("世界上跑的最快的是" + name + "百秒" + n);
    }

    public void eat() {
        System.out.println("我还贼能吃.......");
    }

    public static void sleep() {
        System.out.println("++睡了++");
    }
}