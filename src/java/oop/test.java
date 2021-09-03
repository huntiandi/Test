package oop;

public class test {
    public static void main(String[] args) {
        Son sup = new Son(1);
//        Father father = new Father(2);
//        Father fatherSon = new Son(1);
//        father.run();
//        fatherSon.run();//执行子类方法
        sup.run("博尔特",9);//方法可以在子类中被重载
//        fatherSon.sleep();//被static修饰，所以不可以被重写，所以执行父类方法
        sup.sleep();//可以被重新声明，所以自己执行自己的方法
//        fatherSon.eat();编译不通过，因为接收类型时father，但是father中并没有eat()方法
        color color = oop.color.BLUE;
        System.out.println("color = " + color);

        for (color colors:color.values()) {
            System.out.println("colors有 " + colors+"  索引是: "+colors.ordinal());
        }
    }
}