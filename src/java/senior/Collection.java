package senior;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Test
 * @author: ZhangBiBo
 * @description:
 * @data: 2021/9/3 11:00
 */
public class Collection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("小红");
        list.add("小黑");
        list.add("小蓝");
        for (String str:list) {
            System.out.println("增强for循环方式 " + str);
        }
    }
}
