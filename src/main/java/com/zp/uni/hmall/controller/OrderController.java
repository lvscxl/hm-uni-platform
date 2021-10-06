package com.zp.uni.hmall.controller;

import com.zp.uni.hmall.common.CommonResult;
import com.zp.uni.hmall.vo.OrderVo;
import com.zp.uni.hmall.vo.PageVo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class OrderController {

    @GetMapping("/order/getOrderPage")
    public CommonResult info(String userId, String orderStatus,Integer pageNum, Integer pageSize) {

        System.out.println(" userId: " +userId +" orderStatus :" +orderStatus+" pageNum: " +pageNum + " pageSize: "+pageSize);
        PageVo objectPageVo = new PageVo<>(pageNum, pageSize);
       List<OrderVo> orderList = new ArrayList<>();

       for (int i = 0; i < 10; i++) {

           OrderVo orderVo = new OrderVo();
           orderVo.setId("id " +i +orderStatus +pageNum* 100);
           orderVo.setUserName("zhangsan");
           orderVo.setName("🍗鸡腿"+i);
           orderVo.setCount(new BigDecimal(20));
           orderVo.setPrice(new BigDecimal(234));
           orderVo.setSize(23);
           if (i / 3 ==1) {
               orderVo.setStatus(1);
           }
           if (i / 3 ==2) {
               orderVo.setStatus(2);
           }
           if (i / 3 ==0) {
               orderVo.setStatus(0);
           }
           //orderVo.setStatus(1);
           orderVo.setPayStatus(1);
           orderVo.setImg("http://47.92.83.204:8080/zhangying/img/cart/huoguo.jpg");
           orderList.add(orderVo);
       }
        objectPageVo.setTotal(30L);
        objectPageVo.setData(orderList);
        return CommonResult.success(objectPageVo);
    }


    @GetMapping("/order/order-list2")
    public CommonResult info2(String userId, String status,Integer pageNum, Integer pageSize) {

        System.out.println(" userId: " + userId +" orderStatus :" + status);
        PageVo objectPageVo = new PageVo<>(pageNum, pageSize);
        List<OrderVo> orderList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            OrderVo orderVo = new OrderVo();
            orderVo.setId("id " +i);
            orderVo.setUserName("zhangsan");
            orderVo.setPayStatus(1);
            orderVo.setImg("/static/image/pingguo1.jpg");
            orderList.add(orderVo);
        }
        objectPageVo.setTotal(20L);
        objectPageVo.setData(orderList);
        return CommonResult.success(objectPageVo);
    }

    @GetMapping("/order/getOrderInfo")
    public CommonResult getOrderInfo(String orderId) {

        System.out.println(" orderId: " + orderId );

            OrderVo orderVo = new OrderVo();
            orderVo.setId("id " +123);
            orderVo.setUserName("zhangsan");
            orderVo.setPayStatus(1);
            orderVo.setImg("/static/image/pingguo1.jpg");
        orderVo.setName("华为 pro");
        orderVo.setPrice( new BigDecimal(123));

        return CommonResult.success(orderVo);
    }
}
