package javaBasic;

public class xunHuan {
    /**
     * java中的循环结构，包括for循环，while循环，do...while循环
     * break 结束循环，continue 跳过这一条
     */
    public static void main(String[] args) {
        int x = 10;

        while (x < 13) {

            System.out.println("x = " + ++x);
        }
        do {
            System.out.println("x2 = " + x++);
        } while (x<14);
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
        String [] names = {"小红","小绿","小蓝","小黄","小白"};
        for (String nnnn : names) {
            System.out.println("nnnn = " + nnnn);
        }
    }
}
