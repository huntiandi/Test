package java.senior;

/**
 * @ProjectName: WorkSpace
 * @author: ZhangBiBo
 * @description:
 * @data: 2021/9/6 14:28
 */
public class RunnableDemo implements Runnable {
//public class RunnableDemo extends Thread {本质上thread也是实现了runnable
    private  Thread t ;
    private String name;
    public RunnableDemo(String name){
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println("running......");
        for (int i = 0; i < 3; i++) {
            System.out.println("name=="+name+"  "+i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("exit.......");
    }

    public void start () {
        System.out.println("Starting " +  name );
        if (t == null) {
            t = new Thread (this, name);
            t.start ();
        }
    }
}
