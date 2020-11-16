package com.sy.week5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName ExceptionTest2
 * @Description 编译时异常练习
 * @Author SY
 * @Date 2020/11/2
 **/
public class ExceptionTest2 {
    public static void main(String[] args) {
        //
        try {
            byte[] b = readFile("F:\\LinkedList\1.jpg");
            System.out.println(b.length);
        }catch (IOException e){
            System.out.println("出现IO异常！！");
        }finally {
            System.out.println("无论有无异常都会执行的代码段！");
        }
        System.out.println("其他代码");
    }
    public  static  byte[] readFile(String path) throws IOException{
        File file = new File(path);
        byte[] b = new byte[(int) file.length()];
        InputStream is = new FileInputStream(file);
        int result = is.read(b);
        System.out.println(result);
        return  b;
    }
}
