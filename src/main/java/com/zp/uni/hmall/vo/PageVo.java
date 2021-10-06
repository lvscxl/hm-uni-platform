package com.zp.uni.hmall.vo;

import lombok.Data;

@Data
public class PageVo<T> {

    private Integer pageNum;
    private Integer pageSize;
    private Long total;
    private T data;

    public  PageVo(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }


}
