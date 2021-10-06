package com.zp.uni.hmall.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemVo {

    private String id;
    private String name;
    private String image;
    private String unit;
    private BigDecimal price;
    private BigDecimal count;
    private BigDecimal totalPrice;
    private BigDecimal logisticsPrice;
    private String province;
    private String city;
    private String area;
    private String address;
}
