package com.zp.uni.hmall.controller;

import com.zp.uni.hmall.common.CommonResult;
import com.zp.uni.hmall.vo.DtOrderGoodsVo;
import com.zp.uni.hmall.vo.SwiperVo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class IndexController {

    @GetMapping("/getStuList")
    public CommonResult info() {


        return CommonResult.success(null);
    }

    @GetMapping("/getlunbo")
    public CommonResult getlunbo() {
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

    @GetMapping("/getgoods")
    public CommonResult getgoods() {

        List<DtOrderGoodsVo> list = new ArrayList<>();
        for (int i =0; i < 5; i++) {
            DtOrderGoodsVo dtOrderGoodsVo = new DtOrderGoodsVo();
            dtOrderGoodsVo.setId(i+"1");
            dtOrderGoodsVo.setImgUrl("/static/image/pingguo1.jpg");
            dtOrderGoodsVo.setMarketPrice("123" +i);
            dtOrderGoodsVo.setSellPrice("234");
            dtOrderGoodsVo.setTitle("高兴"+i);
            list.add(dtOrderGoodsVo);
        }

        return CommonResult.success(list);
    }


    @GetMapping("/goods-detail")
    public CommonResult goodsdetail(String id) {

        System.out.println("id ="+ id);

        return CommonResult.success(id);
    }


}
