package com.sy.week3.homework;

/**
 * @ClassName G1
 * @Description TODO
 * @Author SY
 * @Date 2020/10/24
 **/
public class G1 {
    public static void main (String args[ ]) {
        A1 a=new A1();
        System.out.println("最大公约数 ："+a.g(36,24));
        a = new B1();
        System.out.println("最小公倍数 ："+a.g(36,24));
    }
}
