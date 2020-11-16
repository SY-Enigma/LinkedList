package com.sy.weeek8;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName SetTest
 * @Description TODO
 * @Author SY
 * @Date 2020/11/16
 **/
public class SetTest {
    public static void main(String[] args) {
        System.out.println("TreeSet的例子");
        Student s1 = Student.builder().name("asa").age(21).build();
        Student s2 = Student.builder().name("qwa").age(11).build();
        Student s3 = Student.builder().name("gga").age(41).build();
//        Set<Student> stuSet =new TreeSet<>();
        Set<Student> stuSet =new HashSet<>();

        stuSet.add(s1);
        stuSet.add(s2);
        stuSet.add(s3);
        System.out.println(stuSet);




//        Set<String> set = new TreeSet<>();
//        set.add("C");
//        set.add("A");
//        set.add("B");
//        //System.out.println(set);
//
//        System.out.println("for循环遍历");
//        Object[] array = set.toArray();
//        for (Object o :array){
//            System.out.println( o.toString());
//        }
//        System.out.println("iterator遍历");
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        System.out.println("lambda遍历");
//        set.forEach(s -> System.out.println(s));
//
//        System.out.println("使用方法遍历");
//        set.forEach(System.out ::println);
    }
}
