package com.sy.week2;

import lombok.*;

import java.util.Date;





/**
 * @ClassName Book
 * @Description TODO
 * @Author SY
 * @Date 2020/10/12
 * @date 代表 @set @get @tostring
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private  String name;
    private  Integer price;
    private  String press;
    private  String address;
    private Date publishData;

   /* public static void main(String[] args) {
        Book book = new Book("java",222,new Date());
        System.out.println(book);
    }
*/
//    private  String name;
//    private  String author;
//    private  Integer price;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public Integer getPrice() {
//        return price;
//    }
//
//    public void setPrice(Integer price) {
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "hello";
//    }
//
//    public static void main(String[] args) {
//        Book book = new Book();
//        book.setName("html");
//
//        System.out.println(book.toString() );
//    }
}
