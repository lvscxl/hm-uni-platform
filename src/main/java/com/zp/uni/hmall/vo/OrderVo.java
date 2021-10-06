package com.zp.uni.hmall.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderVo {

    private String id;
    private String UserId;
    private String userName;
    private String name;
    private Integer size;
    private BigDecimal price;
    private BigDecimal count;
    private Integer status;
    private Integer payStatus;
    private String img;

}
