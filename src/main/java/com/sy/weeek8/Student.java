package com.sy.weeek8;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Student
 * @Description TODO
 * @Author SY
 * @Date 2020/11/16
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private  String name;
    private  Integer age;

}

//public class Student implements Comparable<Student> {
//    private  String name;
//    private  Integer age;
//
//
// @Override
//  public int compareTo(Student o) {
//    //中级
//    return  o.getAge().compareTo(this.getAge());
// }

//    @Override
//    public int compareTo(Student o) {
//        if (this.getAge() > o.getAge()){
//            return  -1;
//        }else  if (this.getAge() > o.getAge()){
//            return  1;
//        }else {
//            return 0;
//        }
//    }
//}
