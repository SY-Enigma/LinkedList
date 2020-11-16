package com.sy.week4;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MarketEmployeeTest {

    @Test
    public void print() {
//        MarketEmployee me = new MarketEmployee("admin");
//        me.print();
//    Employee you = new  MarketEmployee();
//    assertEquals(300,you.getSalary());
}

        @Test
        public void getSalary() {
//            MarketEmployee me = new MarketEmployee("admin");
//            int salary = me.getSalary();
//            assertEquals(3000, salary);
//            上转型对象
            Employee be = new MarketEmployee("admin");
            assertEquals(3000,be.getSalary());

        }


    }
