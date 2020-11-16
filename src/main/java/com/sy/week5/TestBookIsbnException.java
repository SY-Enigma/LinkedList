package com.sy.week5;

/**
 * @ClassName TestBookIsbnException
 * @Description TODO
 * @Author SY
 * @Date 2020/11/2
 **/
public class TestBookIsbnException {
    public static void main(String[] args)  {
        Book[] books = {
                new Book("1234567899876","Java从入门到精通",90),
                new Book("012348796415a","Java从入门到暴力破解",90),
                new Book("0123487964151","Java从入门到精通",101)};
         IBookServer bs = new BookServiceImpl();
         for (Book book : books){
             try {
                 boolean b = bs.bookShelves(book);
                 if (b){
                     System.out.println(book.getName()+ "成功上架");
                 }
             }catch (BookPriceException | BookNameException | BookIsbnException e){
                 System.out.println(e.getMessage());
             }
         }
        }
    }

