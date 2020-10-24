package com.sy.week3;


/**
 * @ClassName Overload
 * @Description TODO
 * @Author SY
 * @Date 2020/10/19
 **/
public class Overload {
    public  static double sum(double a, double b){
        return  a + b;
    }
    public static String sum(String s1, String s2){
       return  s1 + s2;
    }

    public  static  String sum(int d1, int  d2){
        int sumSecond = d1 + d2;
        int days = sumSecond / (24 * 60 * 60);
        int hours = sumSecond / (60 * 60) - days * 24;
        int minutes = (sumSecond - days * 24 * 60 * 60 - hours * 60 * 60) / 60;

        StringBuilder sb = new StringBuilder();
        if (days != 0) {
            sb.append(days).append("天");
        }
        if (hours != 0) {
            sb.append(hours).append("小时");
        }
        if (minutes != 0) {
            sb.append(minutes).append("分钟");
        }
        int seconds = sumSecond - days * 24 * 60 * 60 - hours * 60 * 60 - minutes * 60;
        if (seconds != 0) {
            sb.append(seconds).append("秒");
        }
        return sb.toString();
    }



    }

