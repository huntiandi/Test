package senior;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * @ProjectName: WorkSpace
 * @author: ZhangBiBo
 * @description: hashSet，hashMap
 * @data: 2021/9/3 16:05
 */
public class HashDemo {
    public static void main(String[] args) {
        //hashSet是无序的，但是换成treeSet就是有序的了
        HashSet<String> hset = new HashSet<String>();
//        TreeSet<String> hset = new TreeSet<String>();
        hset.add("china");
        hset.add("japan");
        hset.add("japan");//重复元素不会被添加
        hset.add("usa");
        System.out.println(hset);
        System.out.println(hset.contains("china"));//判断元素是否存在于集合中

        //hashMap

    }
}
