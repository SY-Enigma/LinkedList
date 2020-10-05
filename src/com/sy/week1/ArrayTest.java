package com.sy.week1;

import java.util.Random;

/**
 * @ClassName ArrayTest
 * @Description TODO
 * @Author SY
 * @Date 2020/10/5
 **/
public class ArrayTest {
     static int MAXa = 10;

    public static void main(String[] args) {

        int[] a = new int[MAXa];
        Random random = new Random();
        for (int i = 0; i < MAXa; i++) {
            a[i] = random.nextInt(100);
            System.out.println(a[i] + "   ");
        }

        int max = a[0];
        int min = a[0];
        int sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += a[j];
            if (a[j] > max) {
                max = a[j];
            }
            if (a[j] < min) {
                min = a[j];
            }
        }
        System.out.println("最大值为: " + max + "\t最小值为: " + min + "\t和为: " + sum);

                //  冒泡排序
           for (int k = 0; k < a.length ; k++){

             for (int z =0; z <a.length-1-k; z++ ){
                  if (a[z]<a[z+1]){
                       int temp=a[z];
                       a[z]=a[z+1];
                       a[z+1]=temp;
                   }
              }

           }
            System.out.println("排序后的数字是:  ");
       for (int f=0; f <a.length;f++){
             System.out.println(a[f]+" ");
         }

//        // 直接排序
//        for (int k = 0; k < a.length; k++) {
//            for (int z = k + 1; z < a.length; z++) {
//                if (a[k] > a[z]) {
//                    int temp = a[k];
//                    a[k] = a[z];
//                    a[z] = temp;
//                }
//            }
//        }
//
//        System.out.println("排序后的数字是:  ");
//       for (int f=0; f <a.length;f++){
//             System.out.println(a[f]+" ");
//         }

    }
}
