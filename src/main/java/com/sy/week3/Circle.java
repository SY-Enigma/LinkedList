package com.sy.week3;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author SY
 * @Date 2020/10/19
 **/

@Getter
@Setter
public class Circle extends Point {
    private  int r;

    public  Circle(){
        System.out.println("圆被初始化了");
    }

    public  Circle(int x, int y, int r){
        super(x,y);
        this.r = r;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("圆的面积:  "+ Math.PI * r * r);
        System.out.println("``````````````````````");
    }

    public double getArea(){
        return Math.PI * r * r;
    }
}
