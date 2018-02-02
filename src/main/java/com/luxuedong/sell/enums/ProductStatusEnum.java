package com.luxuedong.sell.enums;

import lombok.Getter;

/**
 * 商品状态
 * Created by luxuedong
 * 2018/2/1 下午5:13
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
