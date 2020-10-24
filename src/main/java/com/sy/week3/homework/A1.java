package com.sy.week3.homework;

/**
 * @ClassName A1
 * @Description TODO
 * @Author SY
 * @Date 2020/10/24
 **/
public class A1 {
    public int g(int a,int b){
        if(b<a){
            int temp=0;
            temp=a;
            a=b;
            b=temp;
        }
        int r=b%a;
        while(r!=0) {
            b=a;
            a=r;
            r=b%a;
        }
        return a;
    }
}
