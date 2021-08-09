package javaBasic;

public class yunSuanFu {

    public static void main(String[] args) {
        /**
         * 算术运算符
         */
        int a = 2;
        int b = 2;
//        int y = 2*b++;
        System.out.println("b = " + b++);//b++先取值所以输出2
        System.out.println("b = " + b++);//这个时候上一行b已经被加过了所以时3
        System.out.println("a = " + ++a);//++a先自增再取值，所以输出的时3

        /**
         * 位运算符
         */
        int c = 60; /* 60 = 0011 1100 */
        int d = 13; /* 13 = 0000 1101 */
        int e = 0;
        e = c & d;       /* 12 = 0000 1100 都为1为1否则为0*/
        System.out.println("c & d = " + e);

        e = c | d;       /* 61 = 0011 1101 都为0为0否增为1*/
        System.out.println("c | d = " + e);

        e = c ^ d;       /* 49 = 0011 0001 如果相对应位值相同，则结果为0，否则为*/
        System.out.println("c ^ d = " + e);

        e = ~c;          /*-61 = 1100 0011 反向操作 */
        System.out.println("~c = " + e);

        e = c << 2;     /* 240 = 1111 0000 按位左移运算符。左操作数按位左移右操作数指定的位数*/
        System.out.println("c << 2 = " + e);

        e = c >> 2;     /* 15 = 1111 按位右移运算符。左操作数按位右移右操作数指定的位数*/
        System.out.println("c >> 2  = " + e);

        e = c >>> 2;     /* 15 = 0000 1111 	按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充*/
        System.out.println("c >>> 2 = " + e);

        /**
         * 逻辑运算符
         */
        if (a > 0 &&a<3) {
            System.out.println(a);
            System.out.println("+++++++++++++++++");//对于结果而言没有本质的区别，但是&&是短路与，在&&前面的符合条件后才会运行&&后面
            //否则直接关闭，而&会把两边都判断，建议使用&&,一是因为效率二是因为会降低报错概率
        }

        /**
         * 条件运算符
         */
        int f = (a == 10 )? 20:30;
        System.out.println(f);

        Dog dog = new Dog("bibo");
        boolean result = dog instanceof Dog;
        System.out.println(result);

        //运算优先级，和正常的运算优先级一样
        int z = (1+2)+(3+4)*2;
        System.out.println(z);
    }
}
