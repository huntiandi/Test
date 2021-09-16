package com.oop;

/**
 * @ProjectName: Test
 * @author: ZhangBiBo
 * @description:
 * @data: 2021/9/1 16:31
 */
public class Father {
    public int n;

    public Father() {
        System.out.println("我是无参 ");
    }

    public Father(int n) {
        System.out.println(" 我是有参,参数是：" + n);
        this.n = n;
    }

    public void run() throws ArithmeticException{
        System.out.println("  奔跑ing......");
    }

    public void run(String name){
        System.out.println("上世纪跑的最快的是 " + name);
    }

    public static void sleep() {//被static修饰不可以被重写，但可以被子类重新声明；final都不行
        System.out.println("..睡觉..");
    }
}

