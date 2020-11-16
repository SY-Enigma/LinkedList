package com.sy.week5;

/**
 * @ClassName BookPriceException
 * @Description TODO
 * @Author SY
 * @Date 2020/11/2
 **/
public class BookPriceException extends Exception {
    private String msg;

    public BookPriceException(String msg){
        super();
        this.msg = msg;

    }
    public String showMsg(){
        return this.msg;
    }
}
