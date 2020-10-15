package com.sy.week2.homework;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName PC
 * @Description TODO
 * @Author SY
 * @Date 2020/10/15
 **/
@Getter
@Setter
public class PC {
  CPU cpu;
  HardDisk HD;

    public  void  show(){
        System.out.println("CPU速度:"+cpu.getSpeed());
        System.out.println("硬盘容量:"+HD.getAmount());
    }
}
