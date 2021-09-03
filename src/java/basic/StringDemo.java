package basic;

public class StringDemo {
    public static void main(String[] args) {

            String str = "demo";//建立在公共池不可改变 因为底层是一个被final修饰的char数组  private final char value[];
            String str2 = new String("demo2");//建立在堆上的普通对象
            System.out.println("qqq".concat(str2));//concat拼接字符串其实+就行了

        //StringBuild
        StringBuilder stringBuilder = new StringBuilder();//不安全，速度快，可更改
        stringBuilder.append("stringBuilder");
        System.out.println("stringBuilder = " + stringBuilder);

        //StringBuffer
        StringBuffer stringBuffer = new StringBuffer();//线程安全(加锁了)，速度慢，可更改
        stringBuffer.append("sad");
        System.out.println("stringBuffer = " + stringBuffer);
    }
}
