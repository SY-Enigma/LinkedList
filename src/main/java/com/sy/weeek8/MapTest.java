package com.sy.weeek8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName MapTest
 * @Description TODO
 * @Author SY
 * @Date 2020/11/16
 **/
public class MapTest {
    public static void main(String[] args) {

//        Map<String,String> map = new HashMap<>(8);
//        map.put("江苏省", "南京");
//        map.put("福建省", "厦门");
//        map.put("贵州省", "贵阳");
////        System.out.println(map);
//        //for循环遍历
//        for (String key:map.keySet()){
//            String value = map.get(key);
//            System.out.println(key +"省会为: " + value);
//        }

        Map<String,Integer> map = new HashMap<>(8);
        map.put("apple", 12);
        map.put("p", 23);
        map.put("ww", 25);
//        System.out.println(map);
        //for循环遍历
        System.out.println("通过遍历 Map 的 KeySte , 遍历 Key 和 value");
        for (String k : map.keySet()){
            Integer v = map.get(k);
            System.out.println(k +"单价为: " + v);

        }

        System.out.println("Iterator遍历");
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() +"单价为: " + entry.getValue());
        }
        System.out.println("通过遍历 Map 的value , 只遍历value ,获取不到key");
        for(Integer value : map.values()){
            System.out.println(value);
        }

        System.out.println("通过遍历 Map 的entrySet , 遍历value 和Key ,推荐使用");
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "单价为"+ entry.getValue());
        }
        System.out.println("lambda表达式");
        map.forEach((Key,value) ->{
            System.out.println("key:" +Key+",value" +value);
        });






    }
}
