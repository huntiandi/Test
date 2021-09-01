package javaOOP;

/**
 * @ProjectName: Test
 * @author: ZhangBiBo
 * @description:
 * @data: 2021/9/1 16:31
 */
public class Father {
    private int n;

    public Father() {
        System.out.println("我是无参 ");
    }

    public Father(int n) {
        System.out.println(" 我是有参,参数是：" + n);
        this.n = n;
    }
}

class Son extends Father {
    Son() {
        super(100);//子类会默认调用父类的无参构造器，若父类有有参构造器，则应该是使用super在子类
                      //构造器中调用
    }

}

class test {
    public static void main(String[] args) {
        Son sup = new Son();
    }
}
