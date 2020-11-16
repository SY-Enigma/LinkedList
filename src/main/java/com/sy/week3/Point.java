package com.sy.week3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName Point
 * @Description TODO
 * @Author SY
 * @Date 2020/10/19
 **/
@Getter
@Setter
@AllArgsConstructor

public  class Point {

    public Integer x;
    public Integer y;
    public  Point(){
        System.out.println("点被初始化了");

    }
    public  Point(int x, int y){
        this.x=x;
        this.y = y;
        System.out.println("带参数的点被初始化了");
    }
    public  void  print(){
        System.out.println("横坐标： " + this.x  + "\n纵坐标:  "+ this.y);
    }
}
