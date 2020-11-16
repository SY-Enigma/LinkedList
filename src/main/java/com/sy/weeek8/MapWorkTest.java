package com.sy.weeek8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName MapWorkTest
 * @Description TODO
 * @Author SY
 * @Date 2020/11/16
 **/
public class MapWorkTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Tom", "CoreJava");
        map.put("Susan", "Oracle");
        map.put("John", "Oracle");
        map.put("Jerry", "JDBC");
        map.put("Kevin", "JSP");
        map.put("Jim", "Unix");
        map.put("Lucy", "JSP");

        map.put("Allen", "JDBC");

        map.put("Lucy", "CoreJava");

        System.out.println("for循环遍历");
        for (String k : map.keySet()){
            String v = map.get(k);
            System.out.println(k +"教的 " + v );

        }

        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() +"教的: " + entry.getValue());
        }
        System.out.println("教JDBC的教师有：");
        if (map.containsValue("JDBC")){
            for (Map.Entry<String,String> entry : map.entrySet()){
                if (entry.getValue().equals("JDBC")){
                    System.out.println(entry.getKey());
                }
            }
        }
    }

}
