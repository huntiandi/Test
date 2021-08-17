package javaBasic;

public class stringDemo {
    public static void main(String[] args) {

            String str = "demo";//建立在公共池不可改变 因为底层是一个被final修饰的char数组  private final char value[];
            String str2 = new String("demo2");//建立在堆上的普通对象
            System.out.println("qqq".concat(str2));//concat拼接字符串其实+就行了
    }
}
