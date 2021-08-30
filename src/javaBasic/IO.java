package javaBasic;

import java.io.*;

/**
 * @ProjectName: Test
 * @author: ZhangBiBo
 * @description:
 * @data: 2021/8/28 0:52
 */
public class IO {
    public static void main (String[] args) throws IOException {
        File f = new File("..");
//        System.out.println(f.getPath());
//        System.out.println(f.getAbsolutePath());//绝对路径
//        System.out.println(f.getCanonicalPath());//规范路径

        //exe
        File ff = new File("D:\\test");
        String[] strings = ff.list();//list返回的是一级目录的文件名
        for (String s3:strings) {
            System.out.println("list----"+s3);
        }
        File [] ssss = ff.listFiles();//listFiles获取的时目录下的所有文件和目录，想要所有的必须用这个
        for (File s:ssss) {
            if (s.isDirectory()) {
                System.out.println("++++++"+s.getName());
                File[] s1 = s.listFiles();
                for (File s2 : s1) {
                    System.out.println("s2------"+s2);
                }
            }else {
                System.out.println("sssssss-"+s.getName());
            }
        }

        //将11.txt复制到22.txt，实战中从ftp将文件复制到本地
        try (InputStream ins = new FileInputStream("D:\\test\\11.txt"); OutputStream ous = new FileOutputStream("D:\\test\\22.txt")){

            byte[] bytes = new byte[50];
            int bs = 0;
            while ((bs = ins.read(bytes))!= -1){
                ous.write(bytes,0,bs);
            }
        }
    }
}
