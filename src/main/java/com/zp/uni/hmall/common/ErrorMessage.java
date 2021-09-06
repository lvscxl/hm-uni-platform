package com.zp.uni.hmall.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by duanjingjing on 2021/1/6
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {
    private String code;
    private String message;
}
