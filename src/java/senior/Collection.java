package senior;

import java.util.*;

/**
 * @ProjectName: Test
 * @author: ZhangBiBo
 * @description: 集合遍历方式
 * @data: 2021/9/3 11:00
 */
public class Collection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("小红");
        list.add("小黑");
        list.add("小蓝");

        System.out.println("list长度为："+list.size());

        for (String str:list) {
            System.out.println("增强for循环方式 " + str);
        }

        list.set(0,"小紫");//修改一个
        list.add(2,"小黄");//插入一个
        for (int i = 0; i < list.size(); i++) {
            System.out.println("fori方式 "+list.get(i));
        }

        list.remove(3);//删除一个
        Collections.sort(list);//排序,对于中文默认使用ASCII/Unicode的编码排序
        //迭代器
        Iterator<String> ite = list.iterator();
        while (ite.hasNext()){
            System.out.println("迭代器方式是 "+ite.next());
        }

        Map<String,String> map = new HashMap<String,String>();
        map.put("1","小张");
        map.put("2","小李");
        map.put("3","小丁");

        /**
         * keySet取出key再根据key去取value，entrySet是全部取出
         * 只去key用keySet只去value用value，全取用entrySet
         */
        for (String key:map.keySet()) {
            System.out.println("map中的key为"+key+"值为"+map.get(key));
        }

        //推荐，尤其容量大时
        for (Map.Entry<String,String> entry:map.entrySet()) {
            System.out.println("第二种key："+entry.getKey()+"value："+entry.getValue());
        }

        System.out.println(map.keySet()+" "+map.values());
    }

}
