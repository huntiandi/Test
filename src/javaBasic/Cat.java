package javaBasic;

public interface Cat {
    public void eat();
    public default void run(String name){
        System.out.println("name"+name);
    }
}
