package com.sy.week3;

/**
 * @ClassName OverloadTest
 * @Description TODO
 * @Author SY
 * @Date 2020/10/19
 **/
public class OverloadTest {
    public static void main(String[] args) {
        String sum1 = Overload.sum(2, 4);
        System.out.println(sum1);


        String sum2 = Overload.sum("abc", "java");
        System.out.println(sum2);


        String sum3 = Overload.sum(10, 200);
        System.out.println(sum3);
        String sum4 = Overload.sum(20, 150);
        System.out.println(sum4);
        String sum5 = Overload.sum(30, 100);
        System.out.println(sum5);
    }

}
