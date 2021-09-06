package com.zp.uni.hmall.controller;

import com.zp.uni.hmall.common.CommonResult;
import com.zp.uni.hmall.vo.ProductInfoVo;
import com.zp.uni.hmall.vo.SwiperVo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/goods")
@CrossOrigin
public class ProductController {

    @GetMapping("/getthumimages")
    public CommonResult goodsdetail(String id) {

        System.out.println("id ="+ id);
        List<SwiperVo> list = new ArrayList<>();
        SwiperVo swiperVo = new SwiperVo();
        swiperVo.setId("1234");
        //swiperVo.setImg("static\\image\\pingguo1.jpg");
        //swiperVo.setImg("../../static/image/pingguo1.jpg");
        swiperVo.setImg("/static/image/pingguo1.jpg");
        list.add(swiperVo);
        SwiperVo swiperVo1 = new SwiperVo();
        swiperVo1.setId("12345");
        //swiperVo1.setImg("static\\image\\pingguo2.jpg");
        swiperVo1.setImg("/static/image/pingguo2.jpg");
        list.add(swiperVo1);
        return CommonResult.success(list);

    }
    @GetMapping("/getDesc")
    public CommonResult getDesc(String id) {

        String content ="";
        content ="商品详情 asdf "+id;
        return CommonResult.success( content);
    }

    @GetMapping("/getInfo")
    public CommonResult getInfo(String id) {

        ProductInfoVo productInfoVo = new ProductInfoVo();
        productInfoVo.setId(id);
        productInfoVo.setGoodsNo("12345");
        productInfoVo.setMarketPrice("123");
        productInfoVo.setStockQuantity("456");
        productInfoVo.setSellPrice("123");
        productInfoVo.setTitle("apple");
        return CommonResult.success( productInfoVo);
    }
}
