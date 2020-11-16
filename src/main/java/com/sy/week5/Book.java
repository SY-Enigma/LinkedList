package com.sy.week5;

/**
 * @ClassName Book
 * @Description TODO
 * @Author SY
 * @Date 2020/11/2
 **/
public class Book {
private  String name;
private String ISBN;
private Integer price;

    public Book(String name, String ISBN, Integer price) {
        this.name = name;
        this.ISBN = ISBN;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", ISBN=" + ISBN +
                ", price=" + price +
                '}';
    }
}
