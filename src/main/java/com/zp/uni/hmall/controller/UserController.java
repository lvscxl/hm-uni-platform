package com.zp.uni.hmall.controller;

import com.zp.uni.hmall.common.CommonResult;
import com.zp.uni.hmall.vo.UserVo;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController {


    @PostMapping("/user/login")
    public CommonResult info(String loginname, String password) {

        System.out.println(" loginname :" + loginname +" password :" + password);

        UserVo userVo = new UserVo();
        userVo.setId("123");
        userVo.setFullName("张三");
        userVo.setLoginName("zhangsan");
        userVo.setUnitId("12345");
        userVo.setUnitName("三亚");
        return CommonResult.success(userVo);
    }

    @GetMapping("/user/phoneLogin")
    public CommonResult phoneLogin(String phone, String code) {

        System.out.println(" phone :" + phone +" code :" + code);

        UserVo userVo = new UserVo();
        userVo.setId("123");
        userVo.setFullName("张三");
        userVo.setLoginName("zhangsan");
        userVo.setUnitId("12345");
        userVo.setUnitName("三亚");
        return CommonResult.success(userVo);
    }


    @GetMapping("/user/getPhoneCode")
    public CommonResult getPhoneCode(String phone) {

        System.out.println(" phone :" + phone );

        return CommonResult.success("123456");
    }

}
