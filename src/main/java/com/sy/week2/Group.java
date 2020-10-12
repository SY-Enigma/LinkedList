package com.sy.week2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Group
 * @Description TODO
 * @Author SY
 * @Date 2020/10/12
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Group {
    private  String groupName;
    private  String id;
    private  Student[] students;
}
