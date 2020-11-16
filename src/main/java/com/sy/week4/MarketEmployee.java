package com.sy.week4;

/**
 * @ClassName MarketEmployee
 * @Description 市场部员工类
 * @Author SY
 * @Date 2020/10/26
 **/
public class MarketEmployee extends Employee {
    private String id;
    private  static final String ADMIN = "admin";
    private  static final  int  HIGHER_SALARY =3000;
    private  static final  int  LOWER_SALARY =1000;

    public MarketEmployee(String id) {
        this.id = id;
    }
    public MarketEmployee(){
    }


    @Override
    public void print() {
        super.print();
        System.out.println("This is an Employee class");
    }

    @Override
    public int getSalary() {
        if (ADMIN.equals((this.id))) {
            return HIGHER_SALARY;
        }else{
            return LOWER_SALARY;
        }
    }
}
