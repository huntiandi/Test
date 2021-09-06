package senior;

/**
 * @ProjectName: WorkSpace
 * @author: ZhangBiBo
 * @description:
 * @data: 2021/9/6 14:34
 */
public class TestThread {
    public static void main(String[] args) {
        RunnableDemo rd = new RunnableDemo("james");
        rd.start();//run就直接执行完再走下面的，start要抢
        int x= 8;
        System.out.println(x++);
    }
}
