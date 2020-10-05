package com.sy.week1;

/**
 * @ClassName Fac
 * @Description TODO
 * @Author SY
 * @Date 2020/10/5
 **/

public class Fac {
    public static void main(String[] args) {
        int n = 10;
        int result = 1;
        for (int i = 1; i <= n ; i++) {

            result=result *i;
        }
        System.out.println(n +"的阶乘是" + result);
    }

}