package com.zp.uni.hmall.controller;

import com.zp.uni.hmall.common.CommonResult;
import com.zp.uni.hmall.vo.OrderItemVo;
import com.zp.uni.hmall.vo.ProductInfoVo;
import com.zp.uni.hmall.vo.SwiperVo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
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

    @GetMapping("/getProductInfo")
    public CommonResult getProductInfo(String id) {

        List<OrderItemVo> list = new ArrayList<>();

        OrderItemVo orderItemVo = new OrderItemVo();
        orderItemVo.setId("123");
        orderItemVo.setPrice( new BigDecimal(12));
        orderItemVo.setUnit("$");
        orderItemVo.setTotalPrice(  new BigDecimal(23));
        orderItemVo.setCount( new BigDecimal(23));
        orderItemVo.setImage("http://47.92.83.204:8080/zhangying/img/cart/huoguo.jpg");

        orderItemVo.setName("苹果哟");
        orderItemVo.setProvince("海南省");
        orderItemVo.setCity("三亚市");
        orderItemVo.setArea("天涯区");
        orderItemVo.setLogisticsPrice( new BigDecimal(23));

//        list.add(orderItemVo);
//        orderItemVo.setId("3456");
//        list.add(orderItemVo);
        return CommonResult.success( orderItemVo);
    }
}
