package com.zp.uni.hmall.vo;

import lombok.Data;

import java.util.List;

@Data
public class CategoryVo {

    private String id;
    private String parentId;
    private String primaryName;
    private String secondaryName;
    private String title;
    private String cover;
    private List<CategoryVo> list;
}
