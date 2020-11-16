package com.sy.week5;
import java.util.regex.Pattern;

/**
 * @ClassName BookServiceImpl
 * @Description TODO
 * @Author SY
 * @Date 2020/11/2
 **/
public class BookServiceImpl implements IBookServer {

    @Override
    public  boolean  bookShelves(Book book) throws BookIsbnException,BookNameException,BookPriceException{
        Pattern pattern = Pattern.compile("[0 - 9]*");
        String isbn = book.getISBN();
        String name = book.getName();
        int price = book.getPrice();
        System.out.println(pattern.matcher(isbn).matches());

        if (isbn.length() != 13 || !pattern.matcher(isbn).matches()){
            throw  new BookIsbnException(name + "不是13位数字组成");

        }else if (name.contains("暴力") || name.contains("恐怖")){
            throw  new BookNameException(name + " 书名含有禁词！！");
        }else  if (price >100){
            throw  new  BookPriceException(name + "价格超过100元  ");
        }else {
            return  true;
        }

    }
    }

