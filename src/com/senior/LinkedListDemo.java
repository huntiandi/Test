package com.senior;

import java.util.LinkedList;

/**
 * @ProjectName: WorkSpace
 * @author: ZhangBiBo
 * @description:
 * @data: 2021/9/3 15:17
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("james");//add和addLast作用相同
        lList.add("jordan");
        lList.add("kobe");
        lList.addFirst("jabber");
        System.out.println(lList);
        lList.removeFirst();
        System.out.println(lList.getFirst()+" and "+lList.getLast());
    }
}
