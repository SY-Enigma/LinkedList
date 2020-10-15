package com.sy.week2.homework;

/**
 * @ClassName Test
 * @Description TODO
 * @Author SY
 * @Date 2020/10/15
 **/
public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        HardDisk HD =new HardDisk();
        cpu.setSpeed(2200);
        HD.setAmount(200);
        PC pc =new PC();
        pc.setCpu(cpu);
        pc.setHD(HD);
        pc.show();

    }
}
