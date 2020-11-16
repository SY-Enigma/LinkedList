package com.sy.week5;

/**
 * @ClassName BookIsbnException
 * @Description TODO
 * @Author SY
 * @Date 2020/11/2
 **/
public class BookIsbnException extends Exception {
    private String msg;

    public BookIsbnException(String msg){
        super();
        this.msg = msg;

    }
    public String showMsg(){
        return this.msg;
    }
}
