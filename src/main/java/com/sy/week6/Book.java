package com.sy.week6;

import lombok.*;

import java.math.BigDecimal;

/**
 * @ClassName Book
 * @Description TODO
 * @Author SY
 * @Date 2020/11/2
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    private String name;
    private BigDecimal price;
    private String isbn;
}

