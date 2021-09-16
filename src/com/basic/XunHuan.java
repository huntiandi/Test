package com.basic;

public class XunHuan {
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

        switch (0){
            case 1 :
                System.out.println("111111");//没有break就会一直执行case，但不会全部打印
            case 2 :
                System.out.println("222222");//有符合的case没有break就会把后面的case都执行直到遇到break
            case 3 :
                System.out.println("3333333");//遇到break就退出后面就不执行了
                break;
            default:
                System.out.println("\"default\"");//没有case对应值才会执行
        }
    }
}
