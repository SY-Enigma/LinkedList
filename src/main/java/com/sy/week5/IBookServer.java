package com.sy.week5;

/**
 * @ClassName IBookServer
 * @Description TODO
 * @Author SY
 * @Date 2020/11/2
 **/
public interface IBookServer {

    /**
     * @param book 图书上架
     * @return
     * @throws BookIsbnException
     * @throws BookNameException
     * @throws BookPriceException
     */
    boolean bookShelves (Book book) throws BookIsbnException,BookNameException,BookPriceException;


}
