package com.sy.weeek8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ListTest
 * @Description TODO
 * @Author SY
 * @Date 2020/11/16
 **/
public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //增加三个元素
        list.add("java");
        list.add("javaScript");
        list.add("java");
        //随机取出list中某个元素
        list.get((int)(Math.random() * list.size()));

        //用for循环遍历list
        System.out.println("用for循环遍历list");
        for (String s : list){
            System.out.println(s + "");
        }
        System.out.println("用Iterator迭代器遍历list");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + ",");

        }
        //用lambda迭代器遍历list
        System.out.println("用lambda迭代器遍历list");
        list.forEach(s -> System.out.println(s));
        System.out.println("使用lambda的方法应用遍历list,终极简单版本");
        list.forEach(System.out ::println);

    }
}
