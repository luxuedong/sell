package com.luxuedong.sell.viewbean;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * Created by luxuedong
 * 2018/2/2 上午11:43
 */
@Data
public class ResultBean<T> {
    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
