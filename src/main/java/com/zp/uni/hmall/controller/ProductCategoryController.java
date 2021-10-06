package com.zp.uni.hmall.controller;

import com.zp.uni.hmall.common.CommonResult;
import com.zp.uni.hmall.vo.CategoryVo;
import com.zp.uni.hmall.vo.DtOrderGoodsVo;
import com.zp.uni.hmall.vo.PageVo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductCategoryController {

    @GetMapping("/categoryPrimaryQueryAll")
    public CommonResult getgoods() {


        List<CategoryVo> list = new ArrayList<>();
        for (int i =0; i < 45; i++) {
            CategoryVo categoryVo = new CategoryVo();
            categoryVo.setId(i +"");
            categoryVo.setParentId(i +"");
            categoryVo.setPrimaryName("第一级商品分类" + i);
            categoryVo.setSecondaryName("第二级商品分类" + i);
            categoryVo.setCover("/static/logo.png");

            list.add(categoryVo);
        }

        System.out.println(" pageIndex : " + list);
        return CommonResult.success(list);
    }

    @GetMapping("/categorySecondaryQueryAll")
    public CommonResult getgoods1() {


        List<CategoryVo> list = new ArrayList<>();
        for (int i =0; i < 45; i++) {
            CategoryVo categoryVo = new CategoryVo();
            categoryVo.setId(i +"");
            categoryVo.setParentId(i +"");
            categoryVo.setPrimaryName("第一级商品分类" + i);
            categoryVo.setTitle("第一级商品分类" + i);
            categoryVo.setSecondaryName("第二级商品分类" + i);
            categoryVo.setCover("/static/logo.png");

            List<CategoryVo> secondList = new ArrayList<>();
            for (int j =0; j < 10; j++) {
                CategoryVo vo = new CategoryVo();
                vo.setId(j +"");
                vo.setParentId(i +"");
                vo.setPrimaryName("第一级商品分类" + i);
                vo.setSecondaryName("第二级商品分类" + j);
                vo.setTitle("第二级商品分类" + j);
                vo.setCover("/static/logo.png");
                secondList.add(vo);
            }
            categoryVo.setList(secondList);
            list.add(categoryVo);
        }

        System.out.println(" secondList : " + list);
        return CommonResult.success(list);
    }
}
