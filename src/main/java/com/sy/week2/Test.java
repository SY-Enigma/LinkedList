package com.sy.week2;

import java.util.Arrays;
import java.util.Date;

/**
 * @ClassName Test
 * @Description TODO
 * @Author SY
 * @Date 2020/10/12
 **/
public class Test {

    public static void main(String[] args) {
        Book  book1 = new Book("Java面向对象",132,"清华大学出版社","北京",new Date());
        Book  book2 = new Book("Java基础",102,"湖南大学出版社","湖南",new Date());
        Book  book3 = new Book("数据库",152,"清华大学出版社","北京",new Date());
        Book  book4 = new Book("数据算法",192,"清华大学出版社","北京",new Date());
        Book  book5 = new Book("Java进程",202,"清华大学出版社","北京",new Date());

        phones phone1 = new phones("小米10","白色",2300);
        phones phone2 = new phones("iphone11","绿色",5400);
        phones phone3 = new phones("华为P40","红色",6500);

        Student student1 = new Student("丽萨","01","女",new  Book[]{book1, book4},new phones[]{phone1});
        Student student2 = new Student("李三","02","男",new  Book[]{book1, book2,book5},new phones[]{phone3});
        Student student3 = new Student("黎明","03","男",new  Book[]{book3,book5},new phones[]{phone2});

        Group group1 = new Group("海王","001",new Student[]{student1});
        Group group2 = new Group("国光","002",new Student[]{student2,student3});
        System.out.println(Arrays.toString(group1.getStudents()));

    }




}
