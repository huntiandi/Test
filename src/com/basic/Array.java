package com.basic;

import java.util.Arrays;

/**
 * zhangyang
 */
public class Array {
    public static void main(String[] args) {
     int [] ints = new int[5];
     ints[0]=1;
     ints[1]=2;
     ints[2]=3;
     ints[3]=4;
     ints[4]=5;
     int j = 0;
        for (int i = 0; i <5 ; i++) {
             j = j+ints[i];
        }
        System.out.println("j = " + j);

        int [] ints2={9,8,7,6,5};
        //加强for
        for (int x:ints2) {
            System.out.print("x = " + x+"; ");
        }
         String [] aaa = new String[8];
        System.out.println("aaa = " + aaa[4]);//输出的是该类型的默认值


        Array array = new Array();
        array.doIt(ints2);
        System.out.println("ints2 = " + ints2[0]);
        //多维数组
        int [][] arrys = new int[3][5];
        arrys[0] = new int[]{1, 12, 3, 4, 5};
        System.out.println("arrys 00= " + arrys[0][0]);
        System.out.println("arrys = " + Arrays.deepToString(arrys));
    }
    public  void doIt(int[] z){
        int temp = z[z.length-1];
        z[z.length-1] = z[0];
        z[0] = temp;
    }
}
