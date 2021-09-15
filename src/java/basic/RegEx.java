package java.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ProjectName: Test
 * @author: ZhangBiBo
 * @description:
 * @data: 2021/8/27 0:08
 */
public class RegEx {


    private static String REGEX = "dog";
    private static String INPUT = "The dog says meow. " +
            "All dogs say meow.";
    private static String REPLACE = "cat";
    public static void main(String[] args) {
        String string = "this is China";

        String string2 = ".*this.*";

        boolean is = Pattern.matches(string2,string);
        System.out.println("is = " + is);
        System.out.println(string.matches(string2));

        Pattern pattern = Pattern.compile(REGEX);//制定规则
        Matcher m = pattern.matcher(INPUT);//要改的字符串
        while (m.find()){
            System.out.println("m = " + m.group());
            System.out.println("m.start() = " + m.start());//第一次遇到这个规则的位置dog中d
            System.out.println("m.end() = " + m.end());//结束这个规则后的第一个位置dog中g后
        }
        INPUT = m.replaceAll(REPLACE);//替换后，replaceFirst 替换首次匹配，replaceAll 替换所有匹配
        System.out.println(INPUT);

    }

}
