package java.basic;

public interface Cat {
    public void eat();//接口中的方法会被隐式的指定为 public abstract
    public default void run(String name){
        System.out.println("name"+name);
    }
    //这个是静态方法，1.8之前可不行
    static void staticmethod(){
        System.out.println("我是静态方法");
    }
}
