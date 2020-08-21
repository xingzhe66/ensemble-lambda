package com.zhan.cn.consumerls.lambad;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author sir
 * 16:05
 * 境由心生,事在人为
 */

@Data
public class Book {



    private int price;

    private String name;

    public Book(String name,int price){
        this.name = name;
        this.price = price;
    }


}
