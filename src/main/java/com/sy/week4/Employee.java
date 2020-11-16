package com.sy.week4;

/**
 * @ClassName Employee
 * @Description 基础的员工抽象类
 * @Author SY
 * @Date 2020/10/26
 **/
public  abstract class Employee {
    public void print(){
            System.out.println("This is an abstract class.");
    }

    /**
     * 发工资
     * @return int
     */
    public  abstract int getSalary();


}
